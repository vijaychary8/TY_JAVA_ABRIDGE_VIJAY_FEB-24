package com.capgemini.assignment.array;

public class TestB {
	public static void main(String[] args) {
		long[] num= {9491381997l,3236223859l,4046502665l};
		printArray(num);
		System.out.println("****************************");
		long[] got=getArrayData();
		printArray(got);
		}
		static void printArray(long[] var) {
			for(int i=0;i<var.length;i++)
				System.out.println(var[i]);
			
		}
	static long[] getArrayData() {
		long[] values= {65455200511l,300234026656l,50266546555l};
		return values;
	}

}
