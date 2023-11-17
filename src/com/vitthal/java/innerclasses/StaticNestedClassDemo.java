package com.vitthal.java.innerclasses;

public class StaticNestedClassDemo {
    /*

    A static class is a class that is created inside class
    is called the nested satic classin java
    It cannot access non static data maembers and methods
    It can be accessed by the outer class name

    -It can access static data members of the outer class including private
    -The static nested class cannot access non-static (instance) data members

     */
    static int data = 100;
    int value = 20;

    public void message(){
        System.out.println("message");
    }


    //static inner class
    static class Inner {
        void print(){
            System.out.println("Amruta is sick and her body temperature is :"+data+" degree");
        }
    }

    public static void main(String[] args) {

        StaticNestedClassDemo.Inner in = new StaticNestedClassDemo.Inner();
        in.print();

    }


    /*

    Advantages of Inner classes in Java
    1. It helps Code Optimization
    2. If a class useful to only class, it makes sense to keep it nested and together.
    it helps in packaging of the classes
    3. It has nested classes that are used to develop a more redable and maintainable  code
    4. The inner classses can access outer class private members and at the same time, we can hide
       the inner class from the outer world
    5. It requires less code to write

     */

}
