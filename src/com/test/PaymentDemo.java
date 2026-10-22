package com.test;

public class PaymentDemo {
	public static void main(String[] args) {
		Payment[] payments = { new CardPayment(2500, "TX101"), new UPIPayment(1500, "TX102"),
				new WalletPayment(500, "TX103") };

		for (Payment p : payments) {
			p.pay();
		}
	}
}
