package com.test;

public abstract class Assessment {

	private String name;
	private int maxMarks;
	private int obtainedMarks;

	Assessment(String name, int maxMarks, int obtainedMarks) {
		this.name = name;
		this.maxMarks = maxMarks;

		if (maxMarks > 0 && obtainedMarks >= 0 && obtainedMarks <= maxMarks) {
			this.obtainedMarks = obtainedMarks;
		} else {
			this.obtainedMarks = 0;
		}
	}

	public String getName() {
		return name;
	}

	protected int getObtainedMarks() {
		return obtainedMarks;
	}

	abstract String calculateResult();

	class TheoryAssessment extends Assessment {
		TheoryAssessment(String name, int max, int obtained) {
			super(name, max, obtained);
		}

		@Override
		String calculateResult() {
			return getObtainedMarks() >= 40 ? "Pass" : "Fail";
		}
	}
}
