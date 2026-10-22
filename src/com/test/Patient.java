/* Scenario: A hospital registers patients with either basic or complete 
information. */

package com.test;

public class Patient {
	int id;
	String name;
	int age;

	Patient(int id, String name) {
		this(id, name, 0);
	}

	Patient(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String[] args) {
		Patient p1 = new Patient(1, "Neha");
		Patient p2 = new Patient(2, "Rohan", 30);

		p1.display();
		p2.display();
	}
}
