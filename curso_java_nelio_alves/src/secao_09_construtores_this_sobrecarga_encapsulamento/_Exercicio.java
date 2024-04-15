package secao_09_construtores_this_sobrecarga_encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class _Exercicio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		short _accountNumber = sc.nextShort();
		sc.nextLine();

		System.out.print("Enter account holder:");
		String _accountHolder = sc.nextLine();

		System.out.print("Is there na initial deposit (y/n)?");
		char _hasInitialDeposit = sc.next().charAt(0);

		if (_hasInitialDeposit == 'y') {
			System.out.println("Enter initial deposit value: ");
			double _accountBalance = sc.nextDouble();
			account = new Account(_accountNumber, _accountHolder, _accountBalance);

		} else {
			account = new Account(_accountNumber, _accountHolder);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account);

		sc.close();
	}

}

class Account {
	private short accountNumber = 0;
	private String holder;
	private double balance;

	public Account(short accountNumber, String holder, double balance) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.deposit(balance);

	}

	public Account(short accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;

	}

	public short getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(short accountNumber) {
		if (this.accountNumber != 0) {
			this.handleChangeAccountNumber();
			return;
		}
		this.accountNumber = accountNumber;
	}

	public String getHolder() {
		return this.holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return this.balance;
	}

	private void handleChangeAccountNumber() {
		System.out.println("Can't change account number");
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}

	public String toString() {
		return "Account " + this.accountNumber + ", Holder: " + this.holder + ", Balance: $ "
				+ String.format("%.2f", balance);
	}

}
