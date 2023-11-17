package com.vitthal.java.collection.comparabledemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo1 {
    /*

     What is Comparable and Cpmparator

     WHat is COmparable?

     Comparable is an interface
     Collections.sort()

     COmparable interface is used to order the objects of the user defined class
     THis interface is found in java.lang package and contains only one method
      - compareTo(Object o)

     Important Note:
     it provides a single sorting sequence only
     means you can sort the elements on the basis of single data member only
     for example it may be roll no, or age or anything else

   -public int compareTo(Object obj): It is used to compare the current object with the specified object.
    It returns
    positive integer, if the current object is greater than the specified object.
    negative integer, if the current object is less than the specified object.
    zero, if the current object is equal to the specified object.

    We can sort the elements of:
    String objects
    Wrapper class objects
    User-defined class objects

    Collections Class
    Collections class provides static methos for sorting the elements of collections,
    If collection elements are of Set or map we can use TreeSet or TReeMap.
    However we cannot sort the elements of list.
    Collections class provides methods for sorting elements of list type elements

    Method of collections class for sorting List elements
    -public void sort(List list) : it is used to sort the elements of list.
                list elements must be of comparable type (in here Student class implements comparable)


     */

    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>();

        str.add("vitthal");
        str.add("bulbule");
        str.add("amruta");
        str.add("onkar");

        /*
        String class is by default implements COmparable interfaces
        and compareTo method is compares the string value
         */
        Collections.sort(str);
        System.out.println(str);

        ArrayList<Student> students = new ArrayList<>();

        /*
        by default Student class is user defined class and if we wanted to sort we need to
        implement the comparable interface
        and override the compareTo method of comparable interface in Student class
        and override on the basis of what field we need to sort
        here implemented to sort wrt roll no
         */
        Student s1 = new Student(1,"amruta",99);
        Student s2 = new Student(3,"vitthal",56);
        Student s3 = new Student(2,"onkar",76);
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Collections.sort(students);
        System.out.println(students);



    }



}