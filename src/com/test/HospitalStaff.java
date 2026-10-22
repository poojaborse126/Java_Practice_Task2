//Scenario: Doctors and nurses have common staff details but different duties
package com.test;

public class HospitalStaff {
	String name;

	HospitalStaff(String name) {
		this.name = name;
	}

	void displayDuties() {
		System.out.println("General hospital duties");
	}
}
