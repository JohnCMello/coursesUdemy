package secao_15_excecoes.exercicio.model.entities;

import secao_15_excecoes.exercicio_resolvido.modal.exceptions.DomainException;

public class Account {

	protected Integer number;
	protected String holder;
	protected Double balance;
	protected Double withdrawLimit;

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(Double amount) {
		this.balance += amount;
	}

	public void withdraw(Double amount) {
		validateWithdrawAmount(amount);
		this.balance -= amount;
	}

	private void validateWithdrawAmount(Double amount) {
		if (amount > this.withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}

		if (amount > this.balance) {
			throw new DomainException("Not enough balance");
		}
	}
}
