/* Smart Home Device Initialization 
Scenario: A smart-home application loads shared settings and initializes 
each device. */

package com.test;

public class SmartDevice {
	static String network;
	String name;
	String status;

	static {
		network = "Home_WiFi";
		System.out.println("Network configuration loaded");
	}

	{
		status = "OFF";
		System.out.println("Device initialized");
	}

	SmartDevice(String name) {
		this.name = name;
	}

	void display() {
		System.out.println(name + " " + status + " " + network);
	}

	public static void main(String[] args) {
		SmartDevice d1 = new SmartDevice("Light");
		SmartDevice d2 = new SmartDevice("Fan");

		d1.display();
		d2.display();
	}
}
