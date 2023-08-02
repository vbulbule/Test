package com.vitthal.derivedcasting;

public class DriverClassForAnimalClass {
	
	public static void main(String[] args) {
		
		
		/**
		 *
		 * Object
		 * 
		 * Animal
		 * 
		 * Mammal
		 * 
		 * Monkey
		 * 
		 * 
		 */
		
		
		Animal a1 = new Mammal(); //upcasting
		Mammal m1 = new Monkey();
		Animal a2 = new Monkey();
		
		
		// downcasting
		
		Mammal m2 = (Mammal)a1;		
		Monkey m3 = (Monkey)m1;
		Monkey m4 = (Monkey)a2;
		Mammal m5 = (Mammal)a2;
		
	}

}
