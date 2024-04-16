package secao_10_comportamentoMemoria_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

public class _Exercicio_Alturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int amount = sc.nextInt();

		Person1[] peopleArray = new Person1[amount];

		for (int i = 0; i < peopleArray.length; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa:");
			System.out.print("Nome: ");
			String name = sc.next();
			int age;
			
			do {
				System.out.print("Idade (maior que 0): ");
				age = sc.nextInt();
			} while (age <= 0);
			
			System.out.print("Altura (em metros): ");
			
			double height;
			
			do {
				System.out.print("Altura (maior que 0): ");
				height = sc.nextDouble();
			} while (height <= 0);
			
			peopleArray[i] = new Person1(name, age, height);
		}
		
		double averageHeight = calculateAverageHeight(peopleArray);
		double underagePeoplePercentage = calculateUnderagePeoplePercentage(peopleArray);

		System.out.printf("\nAltura média:  = %.2f\n", averageHeight);
		System.out.printf("Pessoas com menos de 16 anos: = %.2f%%\n", underagePeoplePercentage);

		for (Person1 person : peopleArray) {
			if (person.getAge() < 16) {
				System.out.println(person.getName());
			}
		}

		sc.close();

	}

	private static double calculateAverageHeight(Person1[] peopleArray) {
		double totalHeight = 0;
		for (Person1 person : peopleArray) {
			totalHeight += person.getHeight();
		}
		return totalHeight / peopleArray.length;
	}

	private static double calculateUnderagePeoplePercentage(Person1[] peopleArray) {
		int totalUnderage = 0;
		for (Person1 person : peopleArray) {
			if (person.getAge() < 16) {
				totalUnderage++;
			}
		}
		return (totalUnderage * 100.0) / peopleArray.length;
	}

}

class Person1 {
	private String name;
	private int age;
	private double height;

	public Person1(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public double getHeight() {
		return height;
	}


}
