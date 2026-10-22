// Scenario: A bank calculates interest on savings accounts. 

package com.test;

public class Account {
	protected String accountNumber;
	protected double balance;

	Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
}
