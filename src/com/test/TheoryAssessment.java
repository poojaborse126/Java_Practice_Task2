package com.test;

public class TheoryAssessment extends Assessment {
	TheoryAssessment(String name, int max, int obtained) {
		super(name, max, obtained);
	}

	@Override
	String calculateResult() {
		return getObtainedMarks() >= 40 ? "Pass" : "Fail";
	}

}
