package secao_10_comportamentoMemoria_arrays_listas;

import java.util.Scanner;

public class _Exercicio_Matrizes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Number of collumns: ");
		int collumns = sc.nextInt();

		int[][] mat = new int[rows][collumns];

		for (int i = 0; i < mat.length; i++) {
			System.out.print("Array nº " + (i + 1) + ": ");
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			
			}
		}
		System.out.print("Type a number to search : ");
		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}

		sc.close();

	}

}
