package com.capgemini.quiz.day5;

public class Mcq_7 {
	private String function(float i, int f) {
		return ("Question_5");
	}

	private String function(double i, double f) {
		return ("This is Question_4");
	}

	public static void main(String[] args) {
		Mcq_7 q = new Mcq_7();
		System.out.println(q.function(1., 20));
	}

}
