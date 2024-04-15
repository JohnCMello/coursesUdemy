package secao_07_outros_topicos_basicos;

import java.util.Scanner;

public class OperadoresBitwise {

	public static void main(String[] args) {
		/*
		 * Operadores bitwise em Java são utilizados para realizar operações de
		 * manipulação de bits em valores numéricos. Eles operam diretamente nos bits
		 * individuais de um número, permitindo a execução de operações como
		 * deslocamento de bits, operações lógicas e manipulação de máscaras de bits.
		 * Existem seis operadores bitwise em Java:
		 * 
		 * & (AND bitwise): Este operador realiza uma operação lógica AND bitwise em
		 * cada bit correspondente de dois operandos. O resultado é 1 se ambos os bits
		 * correspondentes são 1, caso contrário, o resultado é 0.
		 * 
		 * | A | B | A & B |
		 * |---|---|-------| 
		 * | 0 | 0 |   0   | 
		 * | 0 | 1 |   0   | 
		 * | 1 | 0 |   0   |
		 * | 1 | 1 |   1   |
		 * 
		 * 
		 * | (OR bitwise): Este operador realiza uma operação lógica OR bitwise em cada
		 * bit correspondente de dois operandos. O resultado é 1 se pelo menos um dos
		 * bits correspondentes é 1, caso contrário, o resultado é 0.
		 * 
		 * | A | B | A | B | 
		 * |---|---|-------| 
		 * | 0 | 0 |   0   | 
		 * | 0 | 1 |   1   | 
		 * | 1 | 0 |   1   |
		 * | 1 | 1 |   1   |
		 * 
		 * ^ (XOR bitwise): Este operador realiza uma operação lógica XOR bitwise em
		 * cada bit correspondente de dois operandos. O resultado é 1 se os bits
		 * correspondentes são diferentes, caso contrário, o resultado é 0.
		 * 
		 * | A | B | A ^ B | 
		 * |---|---|-------| 
		 * | 0 | 0 |   0   | 
		 * | 0 | 1 |   1   | 
		 * | 1 | 0 |   1   |
		 * | 1 | 1 |   0   |
		 *  
		 */
		
//		int n1 = 89;
//		int n2 = 60;
//		System.out.println(n1 & n2);
//		System.out.println(n1 | n2);
//		System.out.println(n1 ^ n2);
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false");
		}
		
		sc.close();

	}

}
