package com.test;

public class SavingsAccount extends Account {
	double interestRate;

	SavingsAccount(String accountNumber, double balance, double interestRate) {

		super(accountNumber, balance);
		this.interestRate = interestRate;
	}

	double calculateInterest() {
		return balance * interestRate / 100;
	}

	void display() {
		System.out.println("Account: " + accountNumber);
		System.out.println("Interest: " + calculateInterest());
	}

	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount("SB101", 50000, 4);
		s.display();
	}

	
}
