package secao_04_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

//		String x = sc.next();

//		int x = sc.nextInt();	

//		digitar numero flutuante com pontuação diferente do locale lança erro.
//		digitar 4.5 com locale do brasil da erro, pois no Brasil se usa , (virgula) e vice-versa.
//		double x = sc.nextDouble();

//		char x = sc.next().charAt(0);

//		System.out.println("Você digitou " + x);

//		String x = sc.next();
//		int y = sc.nextInt();
//		double z = sc.nextDouble();

//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
		
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
//		com nextInt existe uma quebra de linha pendente que é consuimida pelo proximo nextLine.
//		nesse caso o proximo nextLine inicia com uma string vazia, s1 recebe uma string vazia.
//		para resolver podemos adicionar um novo nextLine que vai consumir a quebra de linha do nextInt anterior.
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}
