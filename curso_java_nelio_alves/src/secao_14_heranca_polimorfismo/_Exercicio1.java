package secao_14_heranca_polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class _Exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String employeeName;
		Integer employeeHours;
		Double employeeValuePerHour, additionalCharge;

		final List<Employee> employees = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");

		int numberOfEmployees = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= numberOfEmployees; i++) {
			Boolean isOutsourced = false;
			String outsourcedAnswer;
			System.out.println("Employee #" + i + " data:");

			do {
				System.out.print("Outsourced (y/n)? ");
				outsourcedAnswer = sc.nextLine().toUpperCase();
				if (outsourcedAnswer.equals("Y")) {
					isOutsourced = true;
				}
			} while (!outsourcedAnswer.equals("Y") && !outsourcedAnswer.equals("N"));

			System.out.print("Name: ");
			employeeName = sc.nextLine();
			System.out.print("Hours: ");
			employeeHours = sc.nextInt();
			System.out.print("Value per hours: ");
			employeeValuePerHour = sc.nextDouble();
			sc.nextLine();

			if (isOutsourced) {
				System.out.print("Additional charge: ");
				additionalCharge = sc.nextDouble();
				sc.nextLine();

				Employee employee = new OutsourcedEmployee(employeeName, employeeHours, employeeValuePerHour,
						additionalCharge);

				employees.add(employee);

			} else {
				Employee employee = new Employee(employeeName, employeeHours, employeeValuePerHour);

				employees.add(employee);
			}

		}
		System.out.print("PAYMENTS: \n");

		for (Employee _employee : employees) {
			System.out.println(_employee);
		}

		sc.close();
	}

}

class Employee {
	protected String name;
	protected Integer hours;
	protected Double valuePerHour;

	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public Double payment() {
		return hours * valuePerHour;
	}

	public String toString() {
		StringBuilder employee = new StringBuilder();

		employee.append(this.name).append(" - ").append(String.format("%.2f", this.payment()));

		return employee.toString();
	}
}

final class OutsourcedEmployee extends Employee {
	private Double additionalCharge;

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {
		final Double additionalChargeRate = additionalCharge * 0.1;
//		return hours * valuePerHour + additionalCharge + additionaChargeRate;
//		return super.payment() + additionalCharge * 1.1;
		return super.payment() + additionalCharge + additionalChargeRate;
	}
}
