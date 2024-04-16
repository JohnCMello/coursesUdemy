package secao_10_comportamentoMemoria_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

public class _Exercicio_Soma_Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int amount = sc.nextInt();
				
		int[] numbersArray1 = new int[amount]; 
		int[] numbersArray2 = new int[amount];
		int[] numbersArray3 = new int[amount];
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i = 0; i< numbersArray1.length; i++) {
			System.out.print("Digite um numero para a posição " + i + " ");
			numbersArray1[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for(int i = 0; i< numbersArray2.length; i++) {
			System.out.print("Digite um numero para a posição " + i + " ");
			numbersArray2[i] = sc.nextInt();
		}
		
		
		for(int i = 0; i< numbersArray1.length; i++) {
			numbersArray3[i] = numbersArray1[i]+ numbersArray2[i];
		}
		
		System.out.print("VETOR RESULTANTE:\n");
		
		for(int i = 0; i< numbersArray3.length; i++) {
			System.out.println(numbersArray3[i]);
		}
		
	}

}
