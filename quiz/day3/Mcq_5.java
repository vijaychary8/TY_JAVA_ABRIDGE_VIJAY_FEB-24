package com.capgemini.quiz.day3;

public class Mcq_5 {
	double overloadedMethod(double d)
    {
        return d *= d;
    }
     
    int overloadedMethod(int i)
    {
        return overloadedMethod(i *= i);
    }
     
    float overloadedMethod(float f)
    {
        return overloadedMethod(f *= f);
    }
     
    public static void main(String[] args)
    {
    	Mcq_5 main = new Mcq_5();
         
        System.out.println(main.overloadedMethod(100));
    }
}
