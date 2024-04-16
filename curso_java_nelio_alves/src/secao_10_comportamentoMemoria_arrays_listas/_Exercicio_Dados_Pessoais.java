package secao_10_comportamentoMemoria_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

public class _Exercicio_Dados_Pessoais {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int amount = sc.nextInt();

		Person3[] peopleArray = new Person3[amount];

		inputPeopleData(peopleArray, sc);

		int tallestIndex = getTallestPerson(peopleArray);
		int shortestIndex = getShortestPerson(peopleArray);
		double averageHeightOfWomen = calculateAverageHeightOfWomen(peopleArray);
		int numberOfMen = countMen(peopleArray);

		showResults(peopleArray[tallestIndex], peopleArray[shortestIndex], averageHeightOfWomen, numberOfMen);
		sc.close();

	}

	private static void inputPeopleData(Person3[] peopleArray, Scanner sc) {
		for (int i = 0; i < peopleArray.length; i++) {
			System.out.print("Altura da " + (i + 1) + "ª pessoa: ");
			double height = sc.nextDouble();
			System.out.print("Gênero da " + (i + 1) + "ª pessoa: ");
			char gender = sc.next().toUpperCase().charAt(0);

			peopleArray[i] = new Person3(height, gender);
		}
	}

	private static void showResults(Person3 tallestPerson, Person3 shortestPerson, double averageHeightOfWomen,
			int numberOfMen) {
		;
		System.out.println("Menor altura: " + shortestPerson.getHeight());
		System.out.println("Maior altura: " + tallestPerson.getHeight());
		System.out.printf("Média das alturas das mulheres: %.2f%n", averageHeightOfWomen);
		System.out.println("Número de homens: " + numberOfMen);
	}

	private static int getTallestPerson(Person3[] peopleArray) {
		int tallestIndex = 0;
		for (int i = 0; i < peopleArray.length; i++) {

			if (peopleArray[i].getHeight() > peopleArray[tallestIndex].getHeight()) {
				tallestIndex = i;
			}

		}
		return tallestIndex;
	}

	private static int getShortestPerson(Person3[] peopleArray) {
		int shortestIndex = 0;
		for (int i = 1; i < peopleArray.length; i++) {
			if (peopleArray[i].getHeight() < peopleArray[shortestIndex].getHeight()) {
				shortestIndex = i;
			}
		}
		return shortestIndex;
	}

	private static double calculateAverageHeightOfWomen(Person3[] peopleArray) {
		double sumHeight = 0;
		int countWomen = 0;
		for (Person3 person : peopleArray) {
			if (person.getGender() == 'F') {
				sumHeight += person.getHeight();
				countWomen++;
			}
		}
		if (countWomen == 0) {
			return 0;
		}
		return sumHeight / countWomen;
	}

	private static int countMen(Person3[] peopleArray) {
		int count = 0;
		for (Person3 person : peopleArray) {
			if (person.getGender() == 'M') {
				count++;
			}
		}
		return count;
	}
}

class Person3 {
	private double height;
	private char gender;

	public Person3(double height, char gender) {
		this.height = height;
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public char getGender() {
		return gender;
	}

}
