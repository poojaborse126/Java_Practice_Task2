package com.test;

public class VehicleInsurance extends InsurancePolicy {
	VehicleInsurance(double amount) {
		super(amount);
	}

	@Override
	double calculatePremium() {
		return insuredAmount * 0.08;
	}

}
