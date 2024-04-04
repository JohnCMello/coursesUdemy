package secao_5_estrutura_condicional;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		int x = 5;
//
//		System.out.println("Bom dia");
//		if (x < 0) {
//			System.out.println("Boa tarde");
//		}
//		System.out.println("Boa noite");

		int hora = sc.nextInt();

//		if (hora < 12) {
//			System.out.println("Bom dia");
//		} else {
//			System.out.println("Boa tarde");
//		}

		if (hora < 12) {
			System.out.println("Bom dia");
		} else {
			if(hora < 18) {
				System.out.println("Boa tarde");
			} else {
				System.out.println("Boa noite");
			}
		}
		
		sc.close();

	}

}

