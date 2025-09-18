package com.tnsif.staticmethod;

public class student {
	int rollno;
	String Sname;
	String Sbranch;
	static String collegename = "KPRIT";
	void display() {
		System.out.println("Details of student:"+rollno+" "+Sname+" "+Sbranch+" "+collegename);
		
	}

}
