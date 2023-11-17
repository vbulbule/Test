package com.vitthal.java.objectclass;

public class Demo8  {
    /*

     How to generate the Address for a object

     */
    public static void main(String[] args) {
        Demo8 d1 = new Demo8();
        System.out.println(d1); // address wil be print

        Class cls = d1.getClass();
        System.out.println(cls);
        System.out.println(cls.getName()); // fully class name

        System.out.println(d1.hashCode());

        //int val = d1.hashCode();



       // System.out.println(Integer.toHexString(d1.hashCode()));

        System.out.println(cls.getName() +"@"+Integer.toHexString(d1.hashCode()));
        /*
       1. cls.getName() : prints the address of the class excluding the number like
           - com.vitthal.objectclass.Demo8

       2. d1.getClass(); return the CLass object with reflection of Demo8 so it returns the
          - class com.vitthal.objectclass.Demo8

       3. Integer.toHexString() : will convert the int value to hex equivalent String

       4. d1.hashCode() : returns the address in int format

      */



    }
}
