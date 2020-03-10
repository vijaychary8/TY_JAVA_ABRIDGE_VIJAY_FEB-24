package com.capgemini.quiz.day2;

public class Mcq_9 {
    int a = 1;
    int b = 2;
 
    Mcq_9 func(Mcq_9 obj)
    {
    	Mcq_9 obj3 = new Mcq_9();
        obj3 = obj;
        obj3.a = obj.a++ + ++obj.b;
        obj.b = obj.b;
        return obj3;
    }
 
    public static void main(String[] args)
    {
    	Mcq_9 obj1 = new Mcq_9();
    	Mcq_9 obj2 = obj1.func(obj1);
 
        System.out.println("obj1.a = " + obj1.a + "  obj1.b = " + obj1.b);
        System.out.println("obj2.a = " + obj2.a + "  obj1.b = " + obj2.b);
 
    }
}


