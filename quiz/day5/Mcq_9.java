package com.capgemini.quiz.day5;

public class Mcq_9 {
	public int getData() {//For method overloading,methods must have different 
		// signatures
		return 0;
	}

	/*
	 * public long getData() { return 1; }
	 * For method overloading,methods must have different 
		 signatures

	 */
	public long getData( long a) {
		return 1;
	}

	public static void main(String[] args) {
		Mcq_9 q = new Mcq_9();
		System.out.println(q.getData());
	}

}
