package secao_14_heranca_polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class ClassesAbstratas {

	public static void main(String[] args) {
		
//		Account acc1 = new Account(1001, "John", 1000.0);
//		Account acc2 = new SavingsAccount(1002, "Julia", 1000.0, 0.1);
//		Account acc3 = new BusinessAccount(1003, "Cacau", 1000.0, 500.);
		
		List<Account> accounts = new ArrayList<>();
		
		accounts.add(new SavingsAccount(1002, "Julia", 500.0, 0.1));
		accounts.add(new BusinessAccount(1003, "Cacau", 1000.0, 500.));
		accounts.add(new SavingsAccount(1003, "John", 300.0, 0.1));
		
		double sum = 0.0;
		
		for (Account acc: accounts) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total Balance: %.2f%n", sum);
		
		for (Account acc: accounts) {
			acc.deposit(10.0);
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
			
		}
	}

}
