package com.test;

public class Developer extends Staff {
	static {
		System.out.println("Developer static block");
	}

	{
		System.out.println("Developer instance block");
	}

	Developer() {
		System.out.println("Developer constructor");
	}

	public static void main(String[] args) {
		System.out.println("Creating first developer");
		Developer d1 = new Developer();

		System.out.println("Creating second developer");
		Developer d2 = new Developer();
	}
}
