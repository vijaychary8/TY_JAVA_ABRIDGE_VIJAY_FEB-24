package com.capgemini.assignment.array;

public class TestA {
	public static void main(String[] args) {
		double[] num= {45.6,323.6,223.3,40.46,502.665};
		printArray(num);
		double[] got=getArrayData();
		printArray(got);
		}
		static void printArray(double[] var) {
			for(int i=0;i<var.length;i++)
				System.out.println(var[i]);
			
		}
	static double[] getArrayData() {
		double[] values= {6540.55,200.511,300.323,40.26,50.26};
		return values;
	}

		}

	    
	    
	    
	    
	    



