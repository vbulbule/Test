package com.vitthal.java.objectclass;

public class Demo10 {
    public static void main(String[] args) {

        MuskMeloan m1 = new MuskMeloan(100);
        MuskMeloan m2 = new MuskMeloan(200);
        MuskMeloan m3 = new MuskMeloan(100);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m1 == m3);
        System.out.println(m1.equals(m3));
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m3.hashCode());
        System.out.println("-----------Original Hashcode -----------");
        System.out.println(System.identityHashCode(m1));
        System.out.println(System.identityHashCode(m2));
        System.out.println(System.identityHashCode(m3));

    }
}
