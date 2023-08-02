package com.vitthal.derivedcasting;

public class Demo {
	
	public static void main(String[] args) {
		
		/*
		 * Derived Casting 
		 * 
		 * 1. auto widening - Up casting
		 * 2. Explicit narrowing - Down Casting
		 * 
		 * 
		 * Up Casting :    from down to up / from small to bigger / child to parent
		 * 
		 * Down Casting : from top to bottom / from bigger to small/ parent to child
		 * 
		 * Converting a object to behave like another possible type is called derived casting
		 * 
		 * 
		 * 
		 * 
		 */
		Dog d1 = new Dog();
		
		d1.eat();
		d1.sleep();
		d1.barking();
		d1.hasWeagTail();
		
		System.out.println("------------------------------");
		
	 	Animal a1 = new Dog(); // created the object of Dog class and assigned to the Aninal type a1
	 	                       // called up - casting
	 	// dog = chlind class
	 	// Animal = parent  class
	 	// we are creating Object of Dog class that is chlild class and assigning to the Animal type 
	 	//i.e parent class  so its up - casting
	 	
	 	a1.eat();
	 	a1.sleep();
	 //	a1.barking();// not possible because even though Object is Created of dog class but that object is
	 	              // assigned to the Animal type a1 and using a1 we cannot access the methods of Dog class
	 //	a1.haWeagTail()// Not possible
	 	
	 	
	 	
	 	
	 	
	 	
	 	//Dog d5 = new Animal(); // when we try to create an Animal Object it will create only animal object 
	 	                       // there is no relation of animal to Dog so JvM will not understand
	 	                        
	 	// new Dog(); // when we create the Dog object constructor chaining will takesplace as Dog is
	 	              /// Extends to animal and animal is not extending to anyone then by default it will extend to Object
	 	              // chaining will takes places as follows from Dog's class constructor its parent class
	 	              // constructor is callled i.e animal class constructor and in animal class constructor
	 	               // Object class constructor will be called
	 	               // wit this chaining Dogs and Animal objects are getting created and with extends it will
	 	               // derive and relation in between DOg an Animal
	 	
	 	// Down Casting
	 	
	 	//Note: for down casting first we need to upcast or any upcasted can be downcast 
	 	Animal a2 = new Dog(); // upcasted a2
	 	a2.eat();
	 	a2.sleep();
	 	
	 	Dog d3 =(Dog)a2; // upcasted a2 is downcasted
	 	d3.barking();
	 	d3.eat();
	 	d3.hasWeagTail();
	 	d3.sleep();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
