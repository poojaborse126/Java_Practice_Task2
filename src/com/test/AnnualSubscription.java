package com.test;

public class AnnualSubscription extends Subscription {
	AnnualSubscription(String name, double price) {
		super(name, price);
	}

	@Override
	double calculateBill() {

		return price * 12 * 0.9;
	}

}
