package secao_14_heranca_polimorfismo;

public class Heranca {

	public static void main(String[] args) {

		BusinessAccount account = new BusinessAccount(8010, "Bob Brown", 0.0, 500.0);

		/*
		 * getBalance é um metodo definido na class Account.
		 * 
		 * BusinessAccount é uma Account.
		 * 
		 * Account é uma classe genérica, BusinessAccount é uma especialiação
		 * 
		 * Superclasse (classe base) = subclasse (classe derivada)
		 * 
		 * Herança / Extensão
		 * 
		 * Herença é uma associação entre classes e não entre objetos.
		 * 
		 */

		System.out.println(account.getBalance());

	}

}

/*
 * #############################################################################
 * ACCOUNT
 * #############################################################################
 */

abstract class Account {

	private Integer number;
	private String holder;
//	protected libera acesso de membros para classes que extendem outra classe
	protected Double balance;

	public Account() {
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public void deposit(double amount) {
		balance += amount;
	}
}

/*
 * #############################################################################
 * BUSINESS ACCOUNT
 * #############################################################################
 */

class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}
