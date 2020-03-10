package com.capgemini.quiz.day2;

public class Mcq_6 {
	
		  int m_x, m_y;
		   
		  public Mcq_6(int x, int y) { m_x = x; m_y = y; }
		  public Mcq_6() { this(10, 10); }
		  public int getX() { return m_x; }
		  public int getY() { return m_y; }
		   
		  public static void main(String args[]) {
			  Mcq_6 p = new Mcq_6();
		    System.out.println(p.getX());
		  }
		} 



