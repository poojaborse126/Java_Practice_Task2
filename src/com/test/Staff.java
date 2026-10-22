/* Employee Onboarding Execution Order 
Scenario: An HR system initializes company settings and creates 
developer records.  */

package com.test;

public class Staff {
	static {
		System.out.println("Staff static block");
	}

	{
		System.out.println("Staff instance block");
	}

	Staff() {
		System.out.println("Staff constructor");
	}

}

