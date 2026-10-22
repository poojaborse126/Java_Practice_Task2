package com.test;

public class AssessmentDemo {
	public static void main(String[] args) {
		Assessment[] assessments = { new TheoryAssessment("Java Theory", 100, 65),
				new PracticalAssessment("Java Lab", 50, 35) };

		for (Assessment a : assessments) {
			System.out.println(a.getName() + ": " + a.calculateResult());
		}
	}
}
