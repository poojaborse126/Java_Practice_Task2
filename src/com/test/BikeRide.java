package com.test;

public class BikeRide extends Ride {
	BikeRide(double distance) {
		super(distance);
	}

	@Override
	double calculateFare() {
		return 10 + distance * 5;
	}

}
