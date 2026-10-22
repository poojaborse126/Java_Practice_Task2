package com.test;

public class PracticalAssessment extends Assessment {

	PracticalAssessment(String name, int max, int obtained) {
		super(name, max, obtained);
	}

	@Override
	String calculateResult() {
		return getObtainedMarks() >= 20 ? "Pass" : "Fail";
	}

}
