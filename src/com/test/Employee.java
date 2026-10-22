package com.test;

public class Employee {
	int id;
	String name;
	double salary;

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	double calculateBonus() {
		return salary * 0.10;
	}

	void display() {
		System.out.println("Employee: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Bonus: " + calculateBonus());
		System.out.println("Total: " + (salary + calculateBonus()));
	}

	public static void main(String[] args) {
		Employee e = new Employee(1, "Priya", 40000);
		e.display();

	}
}
