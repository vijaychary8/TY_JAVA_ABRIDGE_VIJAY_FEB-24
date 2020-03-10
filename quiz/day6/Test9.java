package com.capgemini.quiz.day6;

public class Test9 {
	int id;  
	String name;  
	Mcq_9 address;  
	  
	public Test9(int id, String name,Mcq_9 address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address = address;  
	}  
	  
	void display(){  
	System.out.println(id+" "+name);  
	System.out.println(address.city+" "+address.state+" "+address.country);  
	}  
	  
	public static void main(String[] args) {  
		Mcq_9 address1=new Mcq_9("nirmal , ","telangana , ","india");  
		Mcq_9 address2=new Mcq_9("nirmal , ","telangana , ","india");  
	  
	Test9 e=new Test9(547,"dikshith",address1);  
	Test9 e2=new Test9(523,"datta",address2);  
	      
	e.display();  
	e2.display();  
	

}
}
