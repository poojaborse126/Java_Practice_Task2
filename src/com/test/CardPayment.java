package com.test;

public class CardPayment extends Payment {
	CardPayment(double amount, String id) {
		super(amount, id);
	}

	@Override
	void pay() {
		System.out.println("Card payment: " + amount + ", ID: " + transactionId);
	}

}
