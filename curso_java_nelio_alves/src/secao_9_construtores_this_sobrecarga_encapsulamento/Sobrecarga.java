package secao_9_construtores_this_sobrecarga_encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Sobrecarga {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");

		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();

//		System.out.print("Quantity in stock: ");
//		int quantity = sc.nextInt();

		Product product = new Product(name, price);
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int _quantity = sc.nextInt();
		
		product.addProducts(_quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		
		_quantity = sc.nextInt();
		product.removeProducts(_quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();

	}

}

