package com.capgemini.quiz.day2;

public class Test8{
	public static void main(String[] args) {
		Mcq_8 obj1 = new Mcq_8();
		Mcq_8 obj2 = obj1;

		obj1.a += 1;
		obj1.b += 1;

		System.out.println("values of obj1 : ");
		obj1.print();
		System.out.println("values of obj2 : ");
		obj2.print();

	}

}
