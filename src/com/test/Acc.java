/*  Mini Banking Application 
Scenario: A bank supports savings and current accounts with different 
interest and service-charge rules.  */

package com.test;

public class Acc {
	private String accountNumber;
	protected double balance;

	static {
		System.out.println("Bank system initialized");

	}

	{
		System.out.println("Creating an account");
	}

	Acc(String accountNumber, double balance) { 
	        this.accountNumber = accountNumber; 
	        this.balance = Math.max(balance, 0); 
	    }

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		} else {
			System.out.println("Invalid deposit");
		}
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid withdrawal");
		} else if (amount > balance) {
			System.out.println("Insufficient balance");
		} else {
			balance -= amount;
		}
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	double calculateCharges() {
		return 0;
	}
}
