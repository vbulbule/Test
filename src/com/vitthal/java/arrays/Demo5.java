package com.vitthal.java.arrays;

public class Demo5 {
    /**
     * Wthat are advantages of Array??
     * we can store wultiple values of same type at single place which makes code optimization
     * and we can rettrive the data or sort the data easily
     * we can also access data from any index
     *
     *
     * What are dis advantages??
     *
     * i. array size is fixed
     * ii. we can have only values/objects type
     *
     * Q can we have array with different objects???
     * Yes . we can have but it should be any subtype only
     * ex :  Fruit[] fruits = new Fruit[]{new Apple(),new Guava() };
     *
     *
     * Q. can we have arry of interface and abstract class??
     * Yes we can have
     * but it should pass the concrete subclass objects
     *
     *
     * Assuingi Fruit is Interface and Orange apple and guava are implementations of fruit interface
     *  Fruit[] fruits = new Fruit[]{new Apple(),new Guava(), new Orange};
     *
     *
     *  IMPORTANT : if we access element where the index is not there then compiler will give
     *  ArrayIndexOutOfBoundException
     *
     *  ex: int[] array = new int[10]
     *  and if i try to access thee arrayp[11] then it will throw the ArrayIndexOutOfBoundException exception
     *
     *
     */

    /**
     * Fruite
     *
     * Apple -> fruite
     * Guava -> fruite
     */

    public static void main(String[] args) {

        Fruit[] fruits = new Fruit[]{new Apple(),new Guava() };

    }
}
