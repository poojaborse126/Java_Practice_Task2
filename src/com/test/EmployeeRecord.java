/*  Immutable Employee Record 
Scenario: An HR system stores employee records that must not be 
changed after creation.  */

package com.test;

public class EmployeeRecord {
	private final int id;
	private final String name;
	private final double salary;

	EmployeeRecord(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public static void main(String[] args) {
		EmployeeRecord e = new EmployeeRecord(101, "Anjali", 60000);

		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}
}
