package com.capgemini.assignment.array;

public class TestD {
	public static void main(String[] args) {
		Items[] i = new Items[4];
		Items s1 = new Items("buffalo", "fridge", " Bata");
		Items s2 = new Items("polo", "laptop", "nike");
		Items s3 = new Items("umbro", "Fan", "loofers");
		Items s4 = new Items("puma", "tv", "addidas");

		i[0] = s1;
		i[1] = s2;
		i[2] = s3;
		i[3] = s4;
		printStudentDetails(i);
		Items[] var = getItems();
		printStudentDetails(var);

		
	}

	static void printStudentDetails(Items[] n) {
		for(int i=0;i<n.length;i++) {
			System.out.println("cloathing = "+ n[i].clothing);
			System.out.println("electronics = "+ n[i].eLectronics);
			System.out.println("footware = "+ n[i].footware);
			System.out.println("************************");
		}
	}
	static Items[] getItems(){
		Items[] i = new Items[4];
		Items s1 = new Items("buffalo1", "mobile", " Bata1");
		Items s2 = new Items("polo1", "light", "nike");
		Items s3 = new Items("umbro", "Fan", "loofers");
		Items s4 = new Items("puma", "tv", "addidas");

		i[0] = s1;
		i[1] = s2;
		i[2] = s3;
		i[3] = s4;
		return i;
		

	}
	{
		
	}
}



