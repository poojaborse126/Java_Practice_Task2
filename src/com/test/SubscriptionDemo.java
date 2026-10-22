package com.test;

public class SubscriptionDemo {
	public static void main(String[] args) {
		Subscription[] plans = { new MonthlySubscription("Ravi", 500),
				new AnnualSubscription("Neha", 500) };

		for (Subscription s : plans) {
			System.out.println(s.getSubscriber() + ": " + s.calculateBill());
		}
	}
}
