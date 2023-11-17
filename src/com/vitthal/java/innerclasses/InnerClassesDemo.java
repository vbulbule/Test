package com.vitthal.java.innerclasses;

public class InnerClassesDemo {
    /*
    What is inner class in Java?

    An Inner class in java is defined as a class that is decalred inside another class.
    Innerr classes are often used to create the helper classes , such as views or adapters that are used by outer class

    inner classes can be either static or non-static
    A static inner class is one that is declared with the static keyword
    A non-static inner class is one that is not declared with the static keyword

    interview question ?
    can we declare class as static?
    - Yes but only inner classes can be static

    What are types of iner classes


    Syntax of inner class

    class Java_Outer_Class
    {
      static class StaticInnerCLass{  // static inner class

      }

      //code
       class java_Inner_class{ // Inner class
      //code
      // data member
      // methods
      }

      public void print(){

      class LocalInnerClass{ // Local Inner class class created inside method
      }

      }

    }

   Advantages of java Inner classes
   1. Nested classes represents a perticcular type of relationship that is it can be access all the members
     (members and methods) of the outer class, including private
   2. used to develop the more readale and maintainable code because it is logiaclly group classes and interfaces
      in one place only
   3. COde optimization : it requires to less code write

   Important Points on Inner java classes
   1. An inner class can be declared as public, private or protected
   2. inner class can be extend any class and implements any interface
   3. It should be noted that if an inner class has been marked as static, it cannot access non static members of the
      outer class. It can access static members of the outter class
   4. YOu cannot create an instance of an inner or nested class without an instance of outer class
   5. inner classes can be ued to write the more modular and resuable code


   - Type Of inner classes

   1. Inner class : A class created within class and outside method
   2. Anonymous Inner class : A class created for implementing an interface or extending class.
                              The java compiler decides its name
   3. Local inner class : a class was created within the method
   4. Static nested class : A static class created within the class
   5. Nested Interface : AN interface within class or interface





     */
}
