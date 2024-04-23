package secao_14_heranca_polimorfismo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Pattern manufacturePattern = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$");
		Matcher matcher;

		final List<Product> products = new ArrayList<>();

		System.out.print("Enter the number of products: ");

		int numberOfProducts = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= numberOfProducts; i++) {
			String productType, productName;
			Double productPrice;

			System.out.println("Product #" + i + " data: ");

			do {
				System.out.print("Common, used or imported (c/u/i)?");
				productType = sc.nextLine().toLowerCase();
			} while (!productType.equals("c") && !productType.equals("u") && !productType.equals("i"));

			System.out.print("Name: ");
			productName = sc.nextLine();

			System.out.print("Price: ");
			productPrice = sc.nextDouble();
			sc.nextLine();

			switch (productType) {
			case "i":
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				sc.nextLine();
				products.add(new ImportedProduct(productName, productPrice, customsFee));
				break;
			case "u":
				String manufactureDate;
				do {
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					manufactureDate = sc.nextLine();
					matcher = manufacturePattern.matcher(manufactureDate);
					if (!matcher.matches()) {
						System.out.println("Invalid date format. Please try again.");
					}

				} while (!matcher.matches());

				products.add(new UsedProduct(productName, productPrice, manufactureDate));
				break;
			default:
				products.add(new Product(productName, productPrice));

			}

		}

		System.out.println("PRICE TAGS:");
		showPriceTags(products);
		sc.close();

	}

	private static void showPriceTags(List<Product> products) {
		for (Product product : products) {
			System.out.println(product.priceTag());
		}
	}
}

class Product {
	protected String name;
	protected double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String priceTag() {
		StringBuilder product = new StringBuilder();

		product.append(this.name + " ").append("$ " + String.format("%.2f", this.price));

		return product.toString();

	}
}

final class ImportedProduct extends Product {
	private Double customsFee;

	public ImportedProduct(String name, double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag() {
		StringBuilder product = new StringBuilder();

		product.append(this.name + " ").append("$ " + String.format("%.2f", this.totalPrice()) + " ")
				.append("(Customs fee: " + String.format("%.2f", this.customsFee) + ")");

		return product.toString();

	}

	public Double totalPrice() {
		return price + customsFee;
	}
}

final class UsedProduct extends Product {
	static DateTimeFormatter formatManufactureDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private LocalDate manufactureDate;

	public UsedProduct(String name, double price, String manufactureDate) {
		super(name, price);
		this.manufactureDate = LocalDate.parse(manufactureDate, formatManufactureDate);
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	@Override
	public String priceTag() {
		StringBuilder product = new StringBuilder();

		product.append(this.name + " (used) ").append("$ " + String.format("%.2f", this.price) + " ")
				.append("(Manufacture date: " + formatManufactureDate.format(manufactureDate) + ")");

		return product.toString();

	}
}
