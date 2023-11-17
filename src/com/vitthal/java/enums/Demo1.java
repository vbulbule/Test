package com.vitthal.java.enums;

public class Demo1 {
    /*
    in simple term ENUM is a type which has a fixed set of values or constants
    it is a special class type
    An ref variable of an enum type can hold only the values that tey are defined in the list

     */

    public static void main(String[] args) {
        Months month;
        month = Months.DECEMBER;
        switch (month){
            case JANUARY:
                System.out.println("January month");
                break;
            case FEBRUARY:
                System.out.println("January month");
                break;
            case MARCH:
                System.out.println("January month");
                break;
            case APRIL:
                System.out.println("January month");
                break;
            default:
                System.out.println(" invalid entry");
                break;

        }

    }
}
