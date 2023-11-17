package com.vitthal.java.derivedcasting;

public class DriverForClassDE {

	public static void main(String[] args) {
		
		/**
		 * Object 
		 * D
		 * E
		 */
		
		D d1  = new E(); // up casting
		d1.test1();
		//d1.test2(); 
		/*
		 * we cannot access the test2() method even it is the Object is created of E class
		 * because
		 * we created the Object of E class but upcasted to the its parent type i.e class D
		 * and wrt d1 is variable to D type so using d1 reference variable we can access only class D methods
		 * 
		 * because when upcast E should behave like D but should not show its behaviour
		 * 
		 */
		System.out.println("----------------------");
		 D d2 = new D(); // normal object creation
		 
		// E e1 = (E) d2;// ??? explicit down casting
		               // class cast error
		//  E e2 =(E) new D(); // class cast error
		System.out.println("-----------------------");
		E e3 =(E)d1;
		e3.test1();
		e3.test2();

		//E e1 = new D(); // it wont be possible
		/**
		 * direct downcasting will not be possible
		 *
		 * Explicit downcast of super class object to subclass results in class Cast exception
		 *
		 */
		//(a).
		  E e1 = (E)new D(); // explicit downcast

		//(b).
		D d3 =new D();
		E e2 =(E)d3; // explicit downcast results in ClassCast EXception

		/**
		 * Note : a and b are same only
		 * in (a) we are creating a Object of D and assiging to E
		 *
		 * in b we creating a reference var d3 and assigning to E
		 *
		 *
		 * INPORTANT : whenever you upcast subclass members cannot be accessed
		 *
		 * IMPORTANT :
		 * 1. Subclass features (methods and variables) will not be in super class
		 * 2. SuperClass features (methodss and variables) will be in sub class
		 *
		 */

		/**
		 * Type Casting
		 *
		 * converting one type to another type is called type casting
		 *
		 * 1. Pritimitive Type Casting
		 * 2. Derived type casting
		 *
		 * 1. Pritimitive Type Casting : converting one primitivtive to another primitive type is known as
		 *    primitive type casting
		 *
		 * Auto Wideing : converting smaller primitive type to bigger primitive type is known as auto widening
		 *                since auto widening is done automatically done by compiler it is also called as auto-widening
		 *
		 * Explicit Narrowing : Converting the bigger primitive type to the smaller primitive type is known as explicit
		 *                      narrowing it should be explicitly specified in the program using () cast operator
		 *
		 * Derived Casting : converting an object to behave loke another possible type is known as derived casting.
		 * 					 In order to convert an object to another type the class should have an IS A relationship
		 *
		 * up-Casting : converting an object of sub-class to behave like any of the super type it is automatically
		 *              done by the compiler hence called auto upcast
		 *
		 * Down-Casting : COnverting any upcasted object to behave like subclass type it should be explicitely specified
		 *                in the program by the user Down casting cannot be directly done
		 *                only an upcasted objected can be down casted
		 *                A explicit downcast uisng () of a superclass object to any of the subclass type complies but
		 *                throws runtime exception-class cast exception
		 *
		 */






	}
}
