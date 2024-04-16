package secao_10_comportamentoMemoria_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

public class _Exercicio_Negativos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int amount = sc.nextInt();
				
		int[] numbersArray = new int[amount]; 
		
		for(int i = 0; i< numbersArray.length; i++) {
			System.out.print("Digite um numero: ");
			numbersArray[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		
		for(int i = 0; i< numbersArray.length; i++) {
			if(numbersArray[i]< 0) {
				System.out.println(numbersArray[i]);
			}
		}
		
		sc.close();
	}

}
