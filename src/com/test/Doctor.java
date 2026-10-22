package com.test;

public class Doctor extends HospitalStaff {
	Doctor(String name) {
		super(name);
	}

	@Override
	void displayDuties() {
		System.out.println(name + " diagnoses patients");
	}

}
