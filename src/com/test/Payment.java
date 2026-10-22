/*  Payment Gateway 
Scenario: An online store supports card, UPI, and wallet payments. */

package com.test;

public abstract class Payment {
	protected double amount;
	protected String transactionId;

	Payment(double amount, String transactionId) {
		this.amount = amount;
		this.transactionId = transactionId;
	}

	abstract void pay();
}
