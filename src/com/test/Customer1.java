/* Secure Customer Profile 
Scenario: A banking application validates customer information before 
updating it. */

package com.test;

public class Customer1 {
	private String name;
	private String email;
	private int age;

	Customer1(String name, String email, int age) { 
        this.name = name; 
        setEmail(email); 
        setAge(age); 
    }

	public void setEmail(String email) {
		if (email != null && email.contains("@")) {
			this.email = email;
		} else {
			System.out.println("Invalid email");
		}
	}

	public void setAge(int age) {
		if (age >= 18 && age <= 120) {
			this.age = age;
		} else {
			System.out.println("Invalid age");
		}
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Customer1 c = new Customer1("Amit", "amit@mail.com", 25);
		c.setEmail("wrong-email");
		c.setAge(15);

		System.out.println(c.getName());
		System.out.println(c.getEmail());
		System.out.println(c.getAge());
	}
}
