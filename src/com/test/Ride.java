/*  Ride-Sharing Fare Calculator 
Scenario: A ride-sharing application calculates fares for bikes, standard 
cars, and premium cars.  */

package com.test;

public class Ride {
	protected double distance;

	Ride(double distance) {
		this.distance = distance;
	}

	double calculateFare() {
		return 30 + distance * 10;
	}
}
