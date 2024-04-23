package secao_14_heranca_polimorfismo;

public class UpcastingDowncasting {

	public static void main(String[] args) {
		/*
		 * Upcasting - atribuir um objeto do tipo da subclasse a uma variável do tipo da
		 * superclasse
		 * 
		 * atribuir um objeto do tipo BusinessAccount a uma variável do tipo Account
		 * 
		 * 
		 * * Downcasting - atribuir um objeto do tipo da superclasse a uma variavel do
		 * tipo da subclasse
		 * 
		 * atribuir um objeto do tipo Account a uma variável do tipo BusinessAccount
		 */

//		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING

		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

		// DOWNCASTING

		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}

		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}

/*
 * #############################################################################
 * SAVINGS ACCOUNT
 * #############################################################################
 */

class SavingsAccount extends Account {

	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}

	@Override
//	final public void withdraw(double amount) {
	public void withdraw(double amount) {
		balance -= amount;
	}
}
