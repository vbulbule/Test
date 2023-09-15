package com.vitthal.wrapperclasses;

public class Demo5 {
    public static void main(String[] args) {

        C c1 = new C();

        c1.test(10);
        c1.test(100);
        Integer i1 = 200;
        c1.test(i1);
        c1.test(100.0);
        Double d1 = 100.0;
        c1.test(d1);

        /*
        Preference of execution??

        same type -> Auto widening -> Wrapper classes -> Number class and Object class
         */
    }
}
