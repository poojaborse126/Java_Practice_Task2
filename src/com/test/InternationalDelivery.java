package com.test;

public class InternationalDelivery extends Delivery {
	InternationalDelivery(double weight) {
		super(weight);
	}

	@Override
	double calculateCharge() {
		return weight * 150 + 500;
	}
}