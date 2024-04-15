package secao_08_intro_poo;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price?: ");
        double dollarRate = sc.nextDouble();
        DolarConverter.setDollarRate(dollarRate);

        System.out.print("How many dollars will be bought?: ");
        double dollars = sc.nextDouble();

        double reais = DolarConverter.convertDollarsToReais(dollars);

        System.out.printf("Amount to be paid in reais = %.2f%n", reais);

        sc.close();

	}

}

class DolarConverter {
    private static double dollarRate;

    public static void setDollarRate(double rate) {
        dollarRate = rate;
    }

    public static double convertDollarsToReais(double dollars) {
        double reais = dollars * dollarRate;
        return reais + (reais * 0.06); 
    }
}