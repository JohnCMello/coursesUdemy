package secao_15_excecoes.exercicio.application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import secao_15_excecoes.exercicio.model.entities.Account;
import secao_15_excecoes.exercicio_resolvido.modal.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Integer accountNumber;
		String accountHolder;
		Double initialBalance, withdrawLimit, withdrawAmount;

		System.out.println("Enter account data");
		
		System.out.print("Name: ");
		accountNumber = sc.nextInt();
		sc.nextLine();

		System.out.print("Holder: ");
		accountHolder = sc.nextLine();

		System.out.print("Initial balance: ");
		initialBalance = sc.nextDouble();

		System.out.print("Withdraw limit: ");
		withdrawLimit = sc.nextDouble();

		Account account = new Account(accountNumber, accountHolder, initialBalance, withdrawLimit);

		System.out.println("\nEnter amount for withdraw: ");
		withdrawAmount = sc.nextDouble();

		try {
			account.withdraw(withdrawAmount);
			System.out.println("New balance: " + String.format("%.2f", account.getBalance()));

		} catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		sc.close();
	}

}
