package com.capgemini.quiz.day7;

public class Mcq_10 {
	public static void main (String[] args)  
	{ 
	    int arr1[] = {1, 2, 3}; 
	    int arr2[] = {1, 2, 3}; 
	    if (arr1 == arr2)  
	        System.out.println("Same"); 
	    else
	        System.out.println("Not same"); 
	    //So when we compare arr1 and arr2, two reference variables are compared, 
	    //therefore we get the output as �Not Same� 
	} 

}
