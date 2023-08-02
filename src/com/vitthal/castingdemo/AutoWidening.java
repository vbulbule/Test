package com.vitthal.castingdemo;

public class AutoWidening {
	
	public static void main(String[] args) {
		/*
		 * pretimitive types
		 * 
		 * byte -> short -> int -> long -> float -> double // auto widening
		 * 
		 * double - > float -> long -> int -> short -> byte // explicit narrowing
		 * 
		 * 
		 */
		double d = 122.30;
		int k = (int)d; // explicit narrowing
		System.out.println(k);
		
		int i = 100;
		
		double l = i; // auto widening
		
		System.out.println(l);
		
		
		final byte b1 = 30; 
		final byte b2 = 40;
		byte b3;
		b3 = (byte)(b1 + b2);
		
		final byte b4;
		b4 = b1+b2;
		
		float f = (float) 12.23;
		
		long l1 = (int)(byte)(long)f; // auto widening
		
		int d1 = (int)(double) (byte) f;
		
		

	}

}
