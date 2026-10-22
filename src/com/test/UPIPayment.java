package com.test;

public class UPIPayment extends Payment {
	UPIPayment(double amount, String id) {
		super(amount, id);
	}

	@Override
	void pay() {
		System.out.println("UPI payment: " + amount + ", ID: " + transactionId);
	}
}
