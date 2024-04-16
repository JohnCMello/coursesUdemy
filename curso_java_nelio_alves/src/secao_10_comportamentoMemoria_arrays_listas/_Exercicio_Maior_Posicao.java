package secao_10_comportamentoMemoria_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

public class _Exercicio_Maior_Posicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int amount = sc.nextInt();

		double[] numbersArray = new double[amount];

		for (int i = 0; i < numbersArray.length; i++) {
			System.out.print("Digite um numero: ");
			numbersArray[i] = sc.nextInt();
		}

		double higherNumber = numbersArray[0];
		int index = 0;

		for (int i = 0; i < numbersArray.length; i++) {

			if (numbersArray[i] > higherNumber) {
				higherNumber = numbersArray[i];
				index = i;
			}

		}

		System.out.printf("MAIOR VALOR = %.1f\n", higherNumber);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", index);

		sc.close();
	}

}
