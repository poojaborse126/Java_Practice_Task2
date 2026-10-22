package com.test;

public class ExpressDelivery extends Delivery {
	ExpressDelivery(double weight) {
		super(weight);
	}

	@Override
	double calculateCharge() {
		return weight * 70 + 100;
	}
}
