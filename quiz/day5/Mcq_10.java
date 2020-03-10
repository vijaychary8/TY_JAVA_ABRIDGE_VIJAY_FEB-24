package com.capgemini.quiz.day5;

import java.io.IOException;// import for IOException

public class Mcq_10 {
	public int getData(String temp) throws IOException{
		//methods that throws different exceptions are not overloaded
		//as their signature are still the same
		return 0;
	}

	/*
	 * public int getData(String temp) throws Exception{ return 1; }
	 * 		methods that throws different exceptions are not overloaded
		as their signature are still the same

	 */
	public int getData(String temp,int y) throws Exception{
		return 1;
	}
	public static void main(String[] args) {
		Mcq_10 q= new Mcq_10();
		System.out.println("Question_2");
	}

}
