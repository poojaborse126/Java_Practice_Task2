package com.test;

public class PremiumRide extends Ride {
	PremiumRide(double distance) {
		super(distance);
	}

	@Override
	double calculateFare() {
		return 100 + distance * 20;
	}

}
