package com.capgemini.assignment.array;

public class TestE {
	public static void main(String[] args) {
		
	
	Object[] b=new Object[2];
	Object s1=new Object(1,"vijay");
	Object s2=new Object(2,"mukesh");
	b[0]=s1;
	b[1]=s2;
	display(b);
}
	static void display(Object[] n) {
		for(int i=0;i<n.length;i++) {
			System.out.println(n[i].x);
		System.out.println(n[i].y);
		}
	}



	
	

}
