package com.test;

public class DiscountDemo {
	public static void main(String[] args) {
		Customer[] customers = { new RegularCustomer(), new PremiumCustomer(), 
				new VIPCustomer() };

		for (Customer c : customers) {
			double discount = c.calculateDiscount(10000);
			System.out.println("Discount: " + discount);
			System.out.println("Final amount: " + (10000 - discount));
		}
	}
}
