package com.capgemini.quiz.day4;

public class Mcq_1 {
	private double radius;

	public Mcq_1(double radius) {
		radius=radius;
		System.out.println(radius);

	}

	void display() {
		System.out.println(radius);
	}

	public static void main(String[] args) {
		Mcq_1 m = new Mcq_1(10);
		m.display();

	}

}

/*
 * The program will compile, but we cannot create an object of Circle with a
 * specified radius. The object will always have radius 0.
 */