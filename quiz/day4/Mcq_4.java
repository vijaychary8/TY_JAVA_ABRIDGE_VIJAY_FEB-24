package com.capgemini.quiz.day4;

public class Mcq_4 {
	static{
        System.out.println("static");
  }

  {
        System.out.println("block");
  }

  public Mcq_4 (){
        System.out.println("A");
  }

  public static void main(String[] args){
	  Mcq_4 a = new Mcq_4();
  }

}
