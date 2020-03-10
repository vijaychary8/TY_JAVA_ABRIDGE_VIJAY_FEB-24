package com.capgemini.assignment.day4;
import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		
	
		/*
		 * int age; String ename; String Address; Double phno; String mail;
		 */	Scanner sc=new Scanner(System.in);
	while (true){
		System.out.println("Choose  1 for name");
		System.out.println("Choose 2 for age");
		System.out.println("choose 3 for address");
		System.out.println("choose 4 for phone no");
		System.out.println("choose 5 for mail");
		System.out.println("choose 6 for Exit");
		
		int x=sc.nextInt();
		switch(x) {
		case 1:
			System.out.println("enter your name");
		String	ename=sc.next();
		System.out.println(ename);

			break;
		case 2:
			System.out.println("enter your age");
			int age=sc.nextInt();
			break;
		case 3:
			System.out.println("enter your address");
			String Address=sc.next();
			break;
		case 4:
			System.out.println("enter your phone no"
					+ "");
			Double phno=sc.nextDouble();
			break;
		case 5:
			System.out.println("enter your mail");
			String mail=sc.next();
			break;
		case 6:
			System.out.println("exit........Thank you!!!");
			
		
				
		}
		
		
		
		
	}
	
	
	
}
	

}
	
	


