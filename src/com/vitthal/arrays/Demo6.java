package com.vitthal.arrays;

public class Demo6 {

    public static void main(String[] args) {

        int [] intArr = {}; // empty int Arry
        char [] cArray = {'c','d'}; // empty char array
        double[] dArray ={}; // empty
        String[] sArray ={}; //empty

        Apple a1 = new Apple();
        System.out.println(a1);

        System.out.println(intArr); // it will print object address
        System.out.println(cArray); // if char arry is empty then it will not print anything
                                    // if its not empty then it will print char values

        System.out.println(dArray);// it will print object address
        System.out.println(sArray);// it will print object address
        intArr= null;
        System.out.println(intArr);

        /**
         * Arrays dont overrite the toString() (Object class method) and so you see the result of the default
         * Object class toString() implementation
         *
         * int arr[] = {};
         * sout(arr) // prints address
         *
         *
         */





    }
}
