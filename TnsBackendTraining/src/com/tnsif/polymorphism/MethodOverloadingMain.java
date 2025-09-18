package com.tnsif.polymorphism;
public class MethodOverloadingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			MethodOverloading ob=new MethodOverloading();
			System.out.println("the addition of integer values"+ob.add(10, 20));
			System.out.println("the addition of float values"+ob.add(1.2f, 1.3f, 1.7f));
			System.out.println("the addition of double values"+ob.add(1.23, 2.34));
	}

}
