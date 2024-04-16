package secao_10_comportamentoMemoria_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

public class _Exercicio_Abaixo_Da_Media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int amount;

		System.out.print("Quantos elementos vai ter o vetor? ");
		amount = sc.nextInt();

		double[] numbersArray = new double[amount];

		for (int i = 0; i < numbersArray.length; i++) {
			System.out.print("Digite um numero: ");
			numbersArray[i] = sc.nextDouble();
		}

		double averageNumber = calculateAverageNumber(numbersArray);

		System.out.printf("MEDIA DO VETOR = %.3f%n", averageNumber);

		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		showUnderaverageNumbers(numbersArray,averageNumber);

	}

	private static double calculateAverageNumber(double[] numbersArray) {
		double totalSum = 0;
		for (double number : numbersArray) {
			totalSum += number;
		}
		return totalSum / numbersArray.length;

	}

	private static void showUnderaverageNumbers(double[] numbersArray, double average) {
		for (double number : numbersArray) {
			if (number < average) {
				System.out.println(number);
			}
		}
	}
}
