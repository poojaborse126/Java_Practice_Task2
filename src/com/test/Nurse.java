package com.test;

public class Nurse extends HospitalStaff
	{

	Nurse(String name) {
		super(name);
	}

	@Override
	void displayDuties() {
		System.out.println(name + " provides patient care");
	}

	public static void main(String[] args) {
		HospitalStaff a = new Doctor("Dr. Mehta");
		HospitalStaff b = new Nurse("Pooja");

		a.displayDuties();
		b.displayDuties();
	}
}
