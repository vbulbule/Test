package com.vitthal.objectclass;

public class Demo6 {
    public static void main(String[] args) {

        Apple a1 = new Apple(100);
        Apple a2 = new Apple(200);
        Apple a3 = new Apple(300);
        Apple a4 = new Apple(100);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println(a1 == a2);
        System.out.println(a1 == a3);

        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a4));
    }
}
