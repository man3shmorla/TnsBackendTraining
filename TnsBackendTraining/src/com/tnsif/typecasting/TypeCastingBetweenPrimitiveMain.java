package com.tnsif.typecasting;

public class TypeCastingBetweenPrimitiveMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 20;//byte to long 
		int i = b;
		System.out.println(i);
		
		float f = 38.25f;//float to double 
		double d = f;
		System.out.println(d);
		
		char ch = 'Z'; //char to int
		int i3 = ch;
		System.out.println(i3);
		
		char var1 = '\u00A7';//char to int 
		int i4 = var1;
		System.out.println(i4);
		// narrowing/explicit type casting
		
		double f1 = 10.52f;//double to long
		long l = (long) f1;
		System.out.println(l);
		
		long l1 = 1234567898;//long to int 
		int i2 = (int) l1;
		System.out.println(i2);
		
		float f2 = 34.56f;//float to int
		int i1 = (int) f2;
		System.out.println(i1);
		
		byte b1 = 90;//byte to char
		char ch1 = (char) b1;
		System.out.println(ch1);
	}

}
