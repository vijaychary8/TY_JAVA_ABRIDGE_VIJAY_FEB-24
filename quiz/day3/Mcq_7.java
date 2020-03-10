package com.capgemini.quiz.day3;

public class Mcq_7 {
	public Mcq_7() 
    { 
        System.out.printf("1"); 
        new Mcq_7(10); 
        System.out.printf("5"); 
    } 
    public Mcq_7(int temp) 
    { 
        System.out.printf("2"); 
        new Mcq_7(10, 20); 
        System.out.printf("4"); 
    } 
    public Mcq_7(int data, int temp) 
    { 
        System.out.printf("3"); 
          
    } 
      
    public static void main(String[] args) 
    { 
    	Mcq_7 obj = new Mcq_7(); 
          
    } 
      

}
