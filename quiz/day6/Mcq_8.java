package com.capgemini.quiz.day6;

public interface Mcq_8 {
	static void paints1() {
		//calling private method
		process();
		System.out.println("paint blue colour");
	   }
	   static void paints2() {
		//calling private method
		process();
		System.out.println("paints yellow colour ");
	   }
	   //this must be static else we will get compilation error
	    static void process() {
		System.out.println("initially white paint");
		System.out.println("then paint any colour");
	   }
	   default void mypaints() {
		paints1();
		paints2();
	   }


}
