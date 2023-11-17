package com.vitthal.java.collection.comparatordemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo1 {
    /*
    WHat is COmparator ?
    Java comparator interface is used to order the objects of user defined class

    it is found in java.util package and contains 2 methods
    compare(Object1, Object2)
    equals(Object o)

    it provides the multiple sorting sequence
    i.e you can sort the elements on the basis of any data memeber
    for ex rollno, name, age or anything else


    methods of java comparator Interface
    public int compare(Object o1, Object o2) : it compares the first object with second object
    public boolean equals(Object o) : it is used to compare the current object with the specified object

    Collections class method to sort using comparator
    public void sort(List list, Comparator c)
     -is used to sort the elements of list by given comparator


     */

    public static void main(String[] args) {
        Employee e1 = new Employee(1000,300000, 1, "Vitthal","IT");
        Employee e2 = new Employee(1003,200000, 3, "Amruta","Mech");
        Employee e3 = new Employee(1002,700000, 7, "Onkar","CSE");
        Employee e4 = new Employee(1006,100000, 1, "Ayush","PROD");
        Employee e5 = new Employee(1001,1000000, 9, "Tejas","CHEMICAL");
        Employee e6 = new Employee(1007,900000, 2, "Prachi","AREOSPACE");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);

        // sorting we can use the sort method of collections class

        EmpIDComparator empIDComparator = new EmpIDComparator();

        Collections.sort(employees,empIDComparator);
        System.out.println(employees);

        Collections.sort(employees, new SalaryComparator());
        System.out.println(employees);





    }
}
