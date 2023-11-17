package com.vitthal.java.innerclasses;

public class MethodLocalInnerClass {
    /*

    A class that is created inside a method is called local inner class in java.
    Local inner classes are the inner classes that are defined inside a block,
    Generally this block is a method body. SSometimes this block can be a for loop, or an if clause.
    Local inner classes are not a member of any enclosing classes.
    They belong to the block they are defined within, due to which loal inner classes cannot have
    any access modifiers associates with them. However, they can be marked as final or abstract.
    These classes have access to the fields of the class enclosing it

    If you want to invoke the methods of the local inner class, you must instantiate this class inside the
    method

    Rules for Java Local inner class:
    1. Local variablesls cant be public, private, or protected
    2. Local inner class cannot be invoked from outside the method
    3. Local inner class cannot access non-final local variable till JDK 1.7, SInce JDK 1.8 it is possible to
    access the non-final local variable in the local inner class

     */
    void outerClassMethod(){
        System.out.println("inside of Oueter CLass Method");
        int val=100; // Local variable must be final till JDK 1.7 bbut as i am having JDK11 so i am able to write
                     // non finla variables
        class Inner{ // class which is created inside method known as Method Local inner class
            void innerClassMethod(){
                System.out.println("Inside the inner class method");
                System.out.println("Value :"+val); // able to access the non fianl local varible in inner class
            }
        }
        Inner i1 = new Inner();
        i1.innerClassMethod();

    }


    public static void main(String[] args) {

        MethodLocalInnerClass m = new MethodLocalInnerClass();
        m.outerClassMethod();
    }

}
