package com.test;

public class InsuranceDemo {
	public static void main(String[] args) {
		InsurancePolicy[] policies = { new HealthInsurance(200000), new VehicleInsurance(500000),
				new LifeInsurance(1000000) };
		for (InsurancePolicy p : policies) {
			System.out.println("Premium: " + p.calculatePremium());
		}
	}
}
