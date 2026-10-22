package com.test;

public class LifeInsurance extends InsurancePolicy {
	LifeInsurance(double amount) {
		super(amount);
	}

	@Override
	double calculatePremium() {
		return insuredAmount * 0.03;
	}

}
