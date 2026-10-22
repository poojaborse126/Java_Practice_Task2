package com.test;

public class DeliveryDemo {
	public static void main(String[] args) {
		Delivery[] deliveries = { new Delivery(2), new ExpressDelivery(2), new InternationalDelivery(2) };

		for (Delivery d : deliveries) {
			System.out.println("Charge: " + d.calculateCharge());
		}
	}
}
