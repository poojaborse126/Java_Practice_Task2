/* Scenario: An insurance company calculates premiums for health, vehicle, 
and life insurance.  */

package com.test;

abstract class InsurancePolicy {
	double insuredAmount;

	InsurancePolicy(double insuredAmount) {
		this.insuredAmount = insuredAmount;
	}

	abstract double calculatePremium();
}
