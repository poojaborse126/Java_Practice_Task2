package com.test;

public class Student {
	int studentId;
	String name;
	String course;

	Student() {
		this.studentId = 0;
		this.name = "Not Assigned";
		this.course = "Not Assigned";
	}

	Student(int studentId, String name, String course) {
		this.studentId = studentId;
		this.name = name;
		this.course = course;
	}

	void display() {
		System.out.println("ID: " + studentId);
		System.out.println("Name: " + name);
		System.out.println("Course: " + course);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(101, "Rahul", "Java");
		s1.display();

		s2.display();
	}
}
