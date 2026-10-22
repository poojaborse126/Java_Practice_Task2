package com.test;

public class StandardRide extends Ride {
	StandardRide(double distance) {
		super(distance);
	}

	@Override
	double calculateFare() {
		return 30 + distance * 12;
	}

}
