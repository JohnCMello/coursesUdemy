package secao_08_intro_poo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		
		System.out.println("Enter rectangle width and height: ");
		
		System.out.print("Width: ");
		rectangle.width = sc.nextDouble();
		
		System.out.print("Height: ");
		rectangle.height = sc.nextDouble();
		
		System.out.println("Area = " + rectangle.area());
		System.out.println("Perimeter = " + rectangle.perimeter());
		System.out.println("Diagonal = " + rectangle.diagonal());
		
		sc.close();

	}

}

class Rectangle{
	protected double width;
	protected double height;
	
	public double area() {
		return width * height;
		
	}
	
	public double perimeter() {
		return 2*(width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
}
