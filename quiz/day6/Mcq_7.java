package com.capgemini.quiz.day6;

public interface Mcq_7 {
	default void bus1() {
		//calling private method
			printLines();
			System.out.println("bus parks at kalimandir");
		   }
		   default void bus2() {
			//calling private method
			printLines();
			System.out.println("bus parks at sun city");
		   }
		   private void printLines() {
			System.out.println("pick up");
			System.out.println("drop");
		   }


}
