package com.capgemini.quiz.day4;

public class Mcq_5 {
	static int a;
    public static void main(String[] args){
          System.out.println("one");
          call(1);
    }

    static void call(int a){
          //this.a=10;
		/*
		 * Static members are common for all objects, where as ‘this’ refer to a
		 * particular object. so we cant use ‘this’ operator in the static methods.
		 */

          System.out.println("two "+a);
    }  

}
