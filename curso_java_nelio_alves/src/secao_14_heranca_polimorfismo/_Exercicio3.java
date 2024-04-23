package secao_14_heranca_polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class _Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		final List<TaxPayer> taxPayers = new ArrayList<>();

		System.out.print("Enter the number of tax payers:  ");

		int numberOfTaxPayers = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= numberOfTaxPayers; i++) {
			System.out.println("Tax payer  #" + i + " data: ");
			String taxMode, taxPayerName;
			Double anualincome;

			do {
				System.out.print("Individual or company (i/c)? ");
				taxMode = sc.nextLine().toLowerCase();
			} while (!taxMode.equals("i") && !taxMode.equals("c"));

			System.out.print("Name: ");
			taxPayerName = sc.nextLine();

			System.out.print("Anual Income: ");
			anualincome = sc.nextDouble();

			switch (taxMode) {
			case "i":
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				sc.nextLine();
				taxPayers.add(new Individual(taxPayerName, anualincome, healthExpenditures));
				break;
			case "c":
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				sc.nextLine();
				taxPayers.add(new Company(taxPayerName, anualincome, numberOfEmployees));
				break;
			}
		}

		System.out.println("\nTAXES PAID: ");
		showListTaxes(taxPayers);
		showTotalTaxes(taxPayers);

		sc.close();
	}

	static private void showListTaxes(List<TaxPayer> taxPayers) {
		for (TaxPayer taxPayer : taxPayers) {
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));

		}
	}

	static private void showTotalTaxes(List<TaxPayer> taxPayers) {
		Double sum = 0.0;
		for (TaxPayer taxPayer : taxPayers) {
			sum += taxPayer.tax();
		}
		System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", sum));
	}

}

abstract class TaxPayer {
	protected String name;
	protected Double anualIncome;

	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	abstract protected Double tax();
}

class Individual extends TaxPayer {
	private Double healthExpenditures;

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	protected Double tax() {
		final Integer TAX_THRESHOLD = 20000;
		if (anualIncome > TAX_THRESHOLD) {
			return (anualIncome * 0.25) - (healthExpenditures * 0.5);
		}
		return (anualIncome * 0.15) - (healthExpenditures * 0.5);

	}

}

class Company extends TaxPayer {
	private Integer numberOfEmployees;

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	protected Double tax() {
		final Integer EMPLOYEE_THRESHOLD = 10;
		if (numberOfEmployees > EMPLOYEE_THRESHOLD) {
			return anualIncome * 0.14;
		}
		return anualIncome * 0.16;
	}
}