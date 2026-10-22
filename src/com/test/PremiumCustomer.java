package com.test;

public class PremiumCustomer extends Customer {
	@Override
	double calculateDiscount(double amount) {
		return amount * 0.10;
	}
}
