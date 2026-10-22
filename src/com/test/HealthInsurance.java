package com.test;

public class HealthInsurance extends InsurancePolicy {
	HealthInsurance(double amount) {
		super(amount);
	}

	@Override
	double calculatePremium() {
		return insuredAmount * 0.05;
	}

}
