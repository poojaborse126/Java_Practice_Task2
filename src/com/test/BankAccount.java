package com.test;

public class BankAccount {
	private String accountHolder;
	private double balance;

	BankAccount(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance >= 0 ? balance : 0;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit successful");
		} else {
			System.out.println("Invalid deposit");
		}
	}

	public double getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		BankAccount account = new BankAccount("Amit", 5000);

		account.deposit(2000);
		System.out.println("Balance: " + account.getBalance());

	}
}
