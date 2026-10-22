/* Delivery Charge Calculator 
Scenario: A delivery company charges different rates for standard, 
express, and international parcels. */

package com.test;

public class Delivery {
	double weight;

	Delivery(double weight) {
		this.weight = weight;
	}

	double calculateCharge() {
		return weight * 40;
	}
	
	}
