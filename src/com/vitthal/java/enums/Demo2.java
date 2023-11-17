package com.vitthal.java.enums;

public class Demo2 {
    /*
    NOTE: enum cant inherit another class call the enumeriations
    automatically inherit java.lang.enum(class)

    2. enum cannot be a super class
    i.e enumerations cant be extended

    enum is used to select one value from the set of values

     */
    public static void main(String[] args) {

        Payment pmt;
        pmt = Payment.CHEQUE;

        System.out.println(pmt.getMinPayment());


        Payment[] allEnmus = Payment.values();

        for (Payment p : allEnmus){
            System.out.println(p);
            System.out.println(p.getMinPayment());
            System.out.println("-------------------------");
        }


    }
}
