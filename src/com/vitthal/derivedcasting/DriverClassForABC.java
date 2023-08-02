package com.vitthal.derivedcasting;

public class DriverClassForABC {
	
	
	/*
	 
	 *(Baap) 
	 *ObjectClass -> (Grandparent)A - > (Parent)B - > (Child)C
	 
	 *   Object  
	 *     A  
	 *     B 
	 *     C 
	 *  
	 */
	
	public static void main(String[] args) {
		
		A a1 = new A(); // normal object creation 
		B b1 = new B();
		C c1 = new C();
		
		A a2 = a1; //a2 i a also reffering to a1
		//A a2 = new A ();
		System.out.println(a1==a2);
		B b2 = b1;
		System.out.println(b1 == b2);
		C c2 = c1;
		System.out.println(c1 == c2);
		
		B b3 = new C(); // upcasting
		A a3 = new B(); // upcasting
		A a4 = new C(); // upcasting
		
		//B b4 = new A(); // direct downcasting is not possible
		                /*
		                 * WHy ???
		                 * 
		                 * because when we create a Object of A the associated Objects of class A and Class Object Objects will be 
		                 * creates
		                 * THere will be no any reference to assign the created A class object to B b4 thats why it will throw the
		                 * compilation error
		                 */
		//C c4 = new B(); //direct downcasting is not possible
		
		//B b4 = (B) new A(); // explicit casting
		                   /*
		                    * Code will successfully compile but it will throw an class cast exception because when we create new A();
		                    * all the associated objects of classA and Class Object Objects will be created but we explicitely trying to
		                    * cast new A(); to class B but there is no such reference with class B whats why code is getting compiled
		                    * but there is runtime error of class cast exception.
		                    */
		//C c4 = (C)new B(); // explicit casting
		
		//C c5 = (C)new A(); // explicit casting
		
		
		B b5 = (B)a3; // upcasted a3 object is downcasting
		C c5 = (C)b3; //upcasted object downcasted to C
		
	}

}
