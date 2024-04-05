package secao_8_intro_poo;

import java.util.Locale;
import java.util.Scanner;

class Triangle {
	public double a;
	public double b;
	public double c;

	public double area() {
		double p = (this.a + this.b + this.c) / 2;
		return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
	}

}

public class ProblemaComPOO {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle triangle1 = new Triangle();
		Triangle triangle2 = new Triangle();

		System.out.println("Enter the measures of triangle X: ");
		triangle1.a = sc.nextDouble();
		triangle1.b = sc.nextDouble();
		triangle1.c = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y: ");
		triangle2.a = sc.nextDouble();
		triangle2.b = sc.nextDouble();
		triangle2.c = sc.nextDouble();

		double areaX = triangle1.area();

		double areaY = triangle2.area();

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		mostraResultado(areaX, areaY);
		
		sc.close();
	}
	
	public static void mostraResultado(double areaX, double areaY) {
		if (areaX > areaY) {
			System.out.println("Larger area:  X");
		} else {
			System.out.println("Larger area:  Y");
		}
	}

}
