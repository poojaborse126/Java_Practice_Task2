package com.test;

public class BankingDemo {
	public static void main(String[] args) {
		Acc[] accounts = { 
				new SavingsAcc("SB101", 50000), new CurrentAcc("CA101", 80000) };

		for (Acc account : accounts) {
			account.deposit(5000);
			account.withdraw(2000);

			System.out.println("Account: " + account.getAccountNumber());
			System.out.println("Balance: " + account.getBalance());
			System.out.println("Charges: " + account.calculateCharges());

			if (account instanceof SavingsAcc) {
				SavingsAcc savings = (SavingsAcc) account;
				System.out.println("Interest: " + savings.calculateInterest());
			}
		}
	}
}
