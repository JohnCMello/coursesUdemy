package secao_08_intro_poo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		System.out.println("Enter Student data: ");

		System.out.print("Name: ");
		student.name = sc.nextLine();

		System.out.print("Grande in first trimester: ");
		student.firstGrade = sc.nextDouble();

		System.out.print("Grande in second trimester: ");
		student.secondGrade = sc.nextDouble();

		System.out.print("Grande in third trimester: ");
		student.thirdGrade = sc.nextDouble();
		
		sc.close();

		double totalGrade = student.sumGrades();

		System.out.println("Final grade = " + totalGrade);
		
		student.getStatus(totalGrade);
		
	}

}

class Student {
	protected String name;
	protected double firstGrade;
	protected double secondGrade;
	protected double thirdGrade;

	public double sumGrades() {
		return this.firstGrade + this.secondGrade + this.thirdGrade;
	}
	
	public void getStatus(double finalGrade) {
		int passingGrade = 60;
		if (finalGrade > passingGrade) {
			System.out.println("Pass");
		} else {
			System.out.println("Failed");
			System.out.println("Missing " + (passingGrade - finalGrade) + " points");
		}

	}
}
