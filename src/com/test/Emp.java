//Scenario: A company initializes its shared name once and registers every employee object.

package com.test;

public class Emp {
	static String company;
	String name;

	static {
		company = "ABC Technologies";
		System.out.println("Static block executed");
	}

	{
		System.out.println("Employee registration started");
	}

	Emp(String name) { 
        this.name = name; 
        System.out.println("Constructor executed"); 
    }

	void display() {
		System.out.println(name + " works at " + company);
	}

	public static void main(String[] args) {
		Emp e1 = new Emp("Asha");
		Emp e2 = new Emp("Vijay");

		e1.display();
		e2.display();
	}
}
