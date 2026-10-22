//Scenario: A streaming service offers monthly and annual subscriptions. 

package com.test;

public class Subscription {
	private String subscriber;
	protected double price;

	Subscription(String subscriber, double price) {
		this.subscriber = subscriber;
		this.price = price;
	}

	String getSubscriber() {
		return subscriber;
	}

	double calculateBill() {
		return price;
	}
}




	