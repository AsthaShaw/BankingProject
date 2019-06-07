package com.bank.mypackage;

/**
 * @author asthashaw
 *
 */
public class Account {

	private double balance;
	static double OVERDRAFT_LIMIT = 100;

	public Account() {
		balance = 0.0;
	}

	// Deposit amount
	public double deposit(double amount) {
		balance = balance + amount;
		return balance;

	}

	// Withdraw amount
	public double withdraw(double amount) {
		if ((balance > 0) && (amount <= balance)) {
			balance = balance - amount;
			return balance;
		} else if (OVERDRAFT_LIMIT == 0 && (amount <= (100 + balance))) {
			OVERDRAFT_LIMIT = -1;
			balance = (balance + 100) - amount;
			return balance;
		} else {
			return -1;
		}
	}

	// Request balance
	public double getBalance() {
		return balance;
	}

	// Request overdraft balance and get subsequent response
	public boolean overdraftResponse() {
		if (OVERDRAFT_LIMIT > 0) {
			OVERDRAFT_LIMIT = 0;
			return true;
		} else {
			return false;
		}
	}

}
