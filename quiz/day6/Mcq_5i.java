package com.capgemini.quiz.day6;

public class Mcq_5i {
	Mcq_5 op;// aggregation
	double pi = 3.14;

	double area(int radius) {
		op = new Mcq_5();
		int rsquare = op.square(radius);// code reusability.
		return pi * rsquare;
	}


}
