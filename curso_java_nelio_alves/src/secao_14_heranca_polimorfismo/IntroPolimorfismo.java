package secao_14_heranca_polimorfismo;

public class IntroPolimorfismo {

	public static void main(String[] args) {
//		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
//		x.withdraw(50.0);
		y.withdraw(50.0);
		
		/*
		 * o metodo withdraw foi sobrescrito em SavingsAccount
		 * 
		 * nao é possivel executar um metodo que só existe em SavingsAccount.
		 * 
		 * y.getInterestRate(), por exemplo.
		 */

//		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
