package secao_04_estrutura_sequencial;

import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		int y = 32;

		System.out.println(y);
		System.out.println("Bom dia");

		double x = 10.35784;

		double z = 20.98765;

		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);

		System.out.println("Resultado = " + x + " METROS");

		System.out.printf("Resultado = %.2f METROS%n", x);

		System.out.printf("Resultado = %.2f METROS, %.4f MINUTOS %n", x, z);

		String nome = "John";
		int idade = 37;
		double renda = 3500.00;

		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

		/*
		 * =====================================================================
		 * EXERCÍCIO DA AULA
		 * =====================================================================
		 */

		Locale.setDefault(Locale.forLanguageTag("pt-BR"));

		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.00;
		double measure = 53.234567;

		System.out.println("##########################################");
		System.out.println("Products: ");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Measure with eught decimal places: %.8f%n", measure);
		System.out.printf("Rounded (three decimal places): %.3f%n", measure);
		System.out.printf(Locale.US, "US decimal point: %.3f%n", measure);
	}

}
