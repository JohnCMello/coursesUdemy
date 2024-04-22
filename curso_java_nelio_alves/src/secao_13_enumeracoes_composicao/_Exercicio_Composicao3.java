package secao_13_enumeracoes_composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _Exercicio_Composicao3 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String name, email;
		String birthDate;

		Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
		Pattern birthdayPattern = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$");
		Matcher matcher;

		System.out.println("Enter cliente data:");

		System.out.print("Name: ");
		name = sc.nextLine();

		do {
			System.out.print("Email: ");
			email = sc.nextLine();
			matcher = emailPattern.matcher(email);
			if (!matcher.matches()) {
				System.out.println("Invalid email address. Please try again.");
			}
		} while (!matcher.matches());

		do {
			System.out.print("Birth date (DD/MM/YYYY): ");
			birthDate = sc.nextLine();
			matcher = birthdayPattern.matcher(birthDate);
			if (!matcher.matches()) {
				System.out.println("Invalid date format. Please try again.");
			}
		} while (!matcher.matches());

		Client client = createClienteInstance(name, email, birthDate);

		System.out.println("Enter order data:");

		String status;
		Integer numberOfItems;

		do {
			System.out.println("(Pending_payment, Processing, Shipped, Delivered)");
			System.out.print("Status: ");
			status = sc.nextLine().trim().toUpperCase();
		} while (!status.equals("PENDING_PAYMENT") && !status.equals("PROCESSING") && !status.equals("SHIPPED")
				&& !status.equals("DELIVERED"));

		System.out.print("How many items to this order? ");
		numberOfItems = sc.nextInt();
		sc.nextLine();

		Order3 order = new Order3(OrderStatus3.valueOf(status), client);

		for (int i = 1; i <= numberOfItems; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer productQuantity = sc.nextInt();
			sc.nextLine();
			Product product = new Product(productName, productPrice);
			OrderItem item = new OrderItem(product, productQuantity);
			order.addItem(item);

		}

		System.out.println("\nORDER SUMMARY");
		System.out.println(order.toString());

	}

	private static Client createClienteInstance(String name, String email, String birthDate) {
		Client client = new Client(name, email, birthDate);
		return client;
	}

}

enum OrderStatus3 {
	PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED
}

class Order3 {
	private LocalDateTime moment;
	private OrderStatus3 status;
	private List<OrderItem> items;
	private Client customer;

	static DateTimeFormatter formatPurchase = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	public Order3(OrderStatus3 status, Client customer) {
		this.status = status;
		this.moment = LocalDateTime.now();
		this.items = new ArrayList<>();
		this.customer = customer;

	}

	public void addItem(OrderItem item) {
		items.add(item);

	}

	public void removeItem(OrderItem item) {
		items.remove(item);

	}

	public Double total() {
		Double totalPrice = 0.0;

		for (OrderItem item : items) {
			totalPrice += item.subtotal();
		}

		return totalPrice;
	}

	public String toString() {
		StringBuilder order = new StringBuilder();

		order.append("Order moment: " + formatPurchase.format(this.moment) + "\n")
				.append("Order moment: " + this.status + '\n').append(this.customer.toString() + "\n")
				.append("Order items: \n");

		for (OrderItem item : this.items) {
			order.append(item.getProduct().getName() + ", ").append("$" + item.getProduct().getPrice() + ", ")
					.append("Quantity: " + item.getQuantity() + ", ")
					.append("Subtotal: $" + String.format("%.2f", item.subtotal())).append("\n");

		}
		
		order.append("Total price: $" + String.format("%.2f",this.total()));
		return order.toString();
	}

}

class OrderItem {
	private Product product;
	private Double price;
	private Integer quantity;

	public OrderItem(Product product, Integer quantity) {
		this.product = product;
		this.price = product.getPrice();
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Double subtotal() {
		return price * quantity;
	}

}

class Product {
	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

}

class Client {
	private String name;
	private String email;
	private LocalDate birthDate;

	static DateTimeFormatter formatBirthday = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Client(String name, String email, String birthDate) {

		this.name = name;
		this.email = email;
		this.birthDate = LocalDate.parse(birthDate, formatBirthday);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public String toString() {
		StringBuilder client = new StringBuilder();

		client.append("Client : ").append(this.name).append(" ")
				.append("(" + this.birthDate.format(formatBirthday) + ")").append(" - ").append(this.email);

		return client.toString();
	}

}
