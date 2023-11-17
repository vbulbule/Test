package com.vitthal.java.innerclasses;

public class NestedInnerClassDemo {

    //Inner class
    class Inner{
        public void show(){
            System.out.println("I am in Inner class of method SHow()");
        }
    }

    public static void main(String[] args) {

      /*
      TO access the show() method of inner class we need to create the object of Inner CLass
      but for the Inner is the Inner class and it exists inside of the NestedInnerClassDemo

      So we need to create the the Object of the NestedInnerClassDemo and using NestedInnerClassDemo object
      we can create the objet of Inner class

       */
        NestedInnerClassDemo.Inner in = new NestedInnerClassDemo().new Inner();
        in.show();

    }

    public void print(){ // non-staic
        System.out.println("Amruta");
    }
}
