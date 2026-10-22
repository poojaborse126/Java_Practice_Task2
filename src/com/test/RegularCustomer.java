package com.test;

public class RegularCustomer extends Customer {
	@Override
	double calculateDiscount(double amount) {
		return amount * 0.05;
	}

}
