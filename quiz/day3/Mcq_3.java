package com.capgemini.quiz.day3;

public class Mcq_3 {
	String msg; 
	 public  Mcq_3 () 
	 { 
	 this("Hello"); 
	 } 
	 public  Mcq_3(String str) 
	 { 
	 msg = str+" India"; 
	 } 
	 public static void main (String[] args) 
	{ 
		 Mcq_3 obj = new  Mcq_3(); 
	 System.out.println(obj.msg);
	}

}
