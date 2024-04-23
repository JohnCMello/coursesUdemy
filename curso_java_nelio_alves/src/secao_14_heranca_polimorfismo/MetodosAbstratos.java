package secao_14_heranca_polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MetodosAbstratos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		final List<Shape> shapes = new ArrayList<>();

		System.out.print("Enter the number of shapes:  ");

		int numberOfShapes = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= numberOfShapes; i++) {
			System.out.println("Shape  #" + i + " data: ");
			String shape, color;

			do {
				System.out.print("Rectangle or Circle (r/c)? ");
				shape = sc.nextLine().toLowerCase();
			} while (!shape.equals("r") && !shape.equals("c"));

			do {
				System.out.print("Color (BLACK/BLUE/RED): ");
				color = sc.nextLine().toUpperCase();
			} while (!color.equals("BLACK") && !color.equals("BLUE") && !color.equals("RED"));

			switch (shape) {
			case "r":
				Double width, height;
				System.out.print("Width: ");
				width = sc.nextDouble();
				System.out.print("Height: ");
				height = sc.nextDouble();
				sc.nextLine();
				shapes.add(new Rectangle(Color.valueOf(color), width, height));
				break;

			case "c":
				Double radius;
				System.out.print("Radius: ");
				radius = sc.nextDouble();
				;
				shapes.add(new Circle(Color.valueOf(color), radius));
				break;
			}

		}

		System.out.println("\nShape Areas: ");
		showArea(shapes);

		sc.close();
	}

	static private void showArea(List<Shape> shapes) {
		for (Shape shape : shapes) {
			System.out.println(String.format("%.2f", shape.area()));
		}
	}

}

enum Color {
	BLACK, BLUE, RED
}

abstract class Shape {
	protected Color color;

	public Shape(Color color) {
		this.color = color;
	}

	abstract protected Double area();
}

final class Rectangle extends Shape {

	private Double height;
	private Double width;

	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	@Override
	public Double area() {
		return width * height;
	}

}

final class Circle extends Shape {

	private Double radius;

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public Double area() {
		return Math.PI * Math.pow(radius, 2);
	}

}