//Scenario: A university calculates tuition and hostel fees. 

package com.test;

public class StudentFee {
	String name;
	double tuition;
	double hostel;

	StudentFee(String name, double tuition) {
		this(name, tuition, 0);
	}

	StudentFee(String name, double tuition, double hostel) {

		this.name = name;
		this.tuition = tuition;
		this.hostel = hostel;
	}

	double totalFee() {
		return tuition + hostel;
	}

	public static void main(String[] args) {
		StudentFee s1 = new StudentFee("Riya", 40000);
		StudentFee s2 = new StudentFee("Karan", 40000, 15000);

		System.out.println(s1.totalFee());
		System.out.println(s2.totalFee());
	}
}
