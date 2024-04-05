package secao_8_intro_poo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.print("Name: ");
		employee.name = sc.nextLine();

		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();

		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Employee: " + employee);
		System.out.println();
		System.out.print("Which percentage to increase salary?: ");

		double percentage = sc.nextDouble();

		sc.close();

		employee.increaseSalary(percentage);

		System.out.println();
		System.out.println("Updated data: " + employee);

	}
}

class Employee {
	protected String name;
	protected double grossSalary;
	protected double tax;

	public double netSalary() {
		return this.grossSalary - this.tax;

	}

	public void increaseSalary(double percentage) {
		this.grossSalary += this.grossSalary * percentage / 100;
	}

	public String toString() {
		return this.name + ", $ " +  String.format("%.2f", netSalary());
	}
}
