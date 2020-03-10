package com.capgemini.assignment.string;

public class CompareTo {
	public static void main(String args[]) {
	      String str1 = "jai telangana";
	      String str2 = new String("jai telangana");
	      String str3 = new String("jai andhra pradesh");
	      
	      int result = str1.compareTo( str2 );
	      System.out.println(result);
	      
	      result = str2.compareTo( str3 );
	      System.out.println(result);
	   }

}
