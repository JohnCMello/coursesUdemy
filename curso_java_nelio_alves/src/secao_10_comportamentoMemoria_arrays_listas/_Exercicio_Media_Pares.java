package secao_10_comportamentoMemoria_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

public class _Exercicio_Media_Pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int amount;

		System.out.print("Quantos elementos vai ter o vetor? ");
		amount = sc.nextInt();

		int[] numbersArray = new int[amount];

		for (int i = 0; i < numbersArray.length; i++) {
			System.out.print("Digite um numero: ");
			numbersArray[i] = sc.nextInt();
		}

		showResults(numbersArray);

		sc.close();

	}

	private static void showResults(int[] numbersArray) {
		int evenNumbers = countEvenNumbers(numbersArray);

		if (evenNumbers == 0) {
			System.out.println("NENHUM NUMERO PAR");
			return;
		}

		double average = calculateAverageNumber(numbersArray);
		System.out.println("MEDIA DOS PARES = " + average);

	}

	private static int countEvenNumbers(int[] numbersArray) {
		int count = 0;
		for (int number : numbersArray) {
			if (number % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	private static double calculateAverageNumber(int[] numbersArray) {
		double totalSum = 0;
		for (int number : numbersArray) {
			totalSum += number;
		}
		return Math.floor(totalSum / numbersArray.length);

	}

}
