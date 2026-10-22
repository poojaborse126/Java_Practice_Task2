package com.test;

public class MonthlySubscription extends Subscription
	{

	MonthlySubscription(String name, double price) {
		super(name, price);
	}

	@Override
	double calculateBill() {
		return price;
	}
}
