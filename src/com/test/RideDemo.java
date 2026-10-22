package com.test;

public class RideDemo {
	public static void main(String[] args) {
		Ride[] rides = { new BikeRide(10),

				new StandardRide(10), new PremiumRide(10) };

		for (Ride r : rides) {
			System.out.println("Fare: " + r.calculateFare());
		}
	}
}
