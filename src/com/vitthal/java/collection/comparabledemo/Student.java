package com.vitthal.java.collection.comparabledemo;

public class Student implements Comparable {

    int rollNo,age;
    String name;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    /*
    if greather we return as 1
    if is equals we return 0
    if is less we return as -1
     */
    @Override
    public int compareTo(Object o) {
        Student st = (Student)o;
        if(rollNo == st.rollNo)
            return 0;
        else if (rollNo>st.rollNo) {
            return 1;
        }
        else
            return -1;

    }

    /*

     */
    @Override
    public String toString() {
       return rollNo+ " "+name+ " "+age;
    }
}
