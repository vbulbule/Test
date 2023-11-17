package com.vitthal.java.innerclasses;

public class AnonymousInnerClassDemo {

    /*
    Java Anonymous inner class in an inner class without a name and for which only a single object is created
    AN AAnonymous inner class can be useful when making an instance of an object with certain "Extras" such as
    overloading methods of class or interface, without having to actually subclass of a class

    in simple words a class that has no name is known as an annonymous inner class in java.
    IMPORTANT : it should be used if you have to override a method of class or interface w/o creating any subclass
    Anonymous inner class can be created in twi ways
    1. Using CLass (Abstract class or concrete class)
    2. Using Interface
     */

    public static void main(String[] args) {

        Person p = new Person(){
            @Override
            void eat() {
                System.out.println("i am eating in anonymous class");
            }
        };

        /*
        A class is created but its name is decided by the compiler which extends the Person class and
        provides the implementation of eat() methof

        an object of the annoymous class is created that is reffered by 'p' and p is the Person type
         */

        p.eat();



    }
}
