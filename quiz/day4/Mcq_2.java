package com.capgemini.quiz.day4;

public class Mcq_2 {
	
	/*
	 * static{ int a = 5; }
	 * compile time error (the variable 'a' in static block cannot 
	 * able to access using this keyword)


	 */
		public static void main(String args[]){
			new Mcq_2().call();
		}

		private static int a;// 

		void call(){
			this.a++;
			System.out.print(this.a);
		}
	


}
