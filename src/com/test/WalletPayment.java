package com.test;

public class WalletPayment extends Payment {
	WalletPayment(double amount, String id) {
		super(amount, id);
	}

	@Override
	void pay() {
		System.out.println("Wallet payment: " + amount + ", ID: " + transactionId);
	}

}
