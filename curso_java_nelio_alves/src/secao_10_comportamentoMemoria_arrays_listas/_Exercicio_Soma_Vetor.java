package secao_10_comportamentoMemoria_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

public class _Exercicio_Soma_Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int amount = sc.nextInt();
		double soma = 0.0;
		double media = 0.0;

		double[] numbersArray = new double[amount];

		for (int i = 0; i < numbersArray.length; i++) {
			System.out.print("Digite um numero: ");
			numbersArray[i] = sc.nextDouble();
		}

		for (int i = 0; i < numbersArray.length; i++) {
			soma += numbersArray[i];
		}

		media = soma / amount;

		System.out.print("VALORES = ");

		for (int i = 0; i < numbersArray.length; i++) {
			System.out.printf("%.1f  ", numbersArray[i]);
		}

		System.out.printf("\nSOMA = %.2f\n", soma);
		System.out.printf("MEDIA = %.2f\n", media);

		sc.close();

	}

}
