package com.tnsif.loops;

public class ContinueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k = 5; k < 15; k++)
		{
		// Odd numbers are skipped
		if (k%2 != 0)
		continue;
		// Even numbers are printed
		System.out.println(k + " ");
		}


	}

}
