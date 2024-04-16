package secao_10_comportamentoMemoria_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

public class _Exercicio_Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos deseja cadastrar? ");
		int amount = sc.nextInt();

		Student[] studentsArray = new Student[amount];

		for (int i = 0; i < studentsArray.length; i++) {
			System.out.println("\nDigite nome, primeira e segunda nota do " + (i + 1) + "º aluno:");
			System.out.print("Nome: ");
			String name = sc.next();

			double[] grades = new double[2];

			for (int j = 0; j < grades.length; j++) {
				System.out.print("Nota " + (j + 1) + ": ");
				grades[j] = sc.nextDouble();
			}

			studentsArray[i] = new Student(name, grades);
		}

		System.out.println("\nAlunos aprovados:");
		for (Student student : studentsArray) {
			if (student.calculateAverageGrade() >= 6.0) {
				System.out.println(student.getName());
			}
		}

		sc.close();

	}

}

class Student {
	private String name;
	private double[] grades;

	public Student(String name, double[] grades) {
		this.name = name;
		this.grades = grades;
	}

	public String getName() {
		return name;
	}

	public double calculateAverageGrade() {
		double total = 0;
		for (double grade : grades) {
			total += grade;
		}
		return total / grades.length;
	}

}
