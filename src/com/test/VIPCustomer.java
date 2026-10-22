package com.test;

public class VIPCustomer extends Customer {
	@Override
	double calculateDiscount(double amount) {
		return amount * 0.20;
	}

}
