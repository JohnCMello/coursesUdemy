package secao_8_intro_poo;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProduto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Enter product data: ");

		System.out.print("Name: ");
		product.name = sc.nextLine();

		System.out.print("Price: ");
		product.price = sc.nextDouble();

		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();

		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");

		int products = sc.nextInt();
		product.addProducts(products);

		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");

		products = sc.nextInt();
		product.removeProducts(products);

		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();
	}

}

class Product {
	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return this.price * this.quantity;
	}

	public void addProducts(int value) {
		this.quantity += value;
	}

	public void removeProducts(int value) {
		this.quantity -= value;
	}

	public String toString() {
		return this.name + ", $ " + this.price + ", " + this.quantity + " units, Total: $ "
				+ String.format("%.2f", this.totalValueInStock());
	}

}
