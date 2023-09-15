package com.vitthal.wrapperclasses;

public class Demo4 {
    public static void main(String[] args) {

        int i = 100;
        Integer i1 = i; // boxing operation

        System.out.println(i1);

        int j = i1.intValue(); // unboxing
        System.out.println(j);

        double d = i1.doubleValue(); // unboxing and autowidening
        System.out.println(d);

        Double d1 = d; // boxing
        System.out.println(d1);

        Double d2 = new Double("12.56");
        System.out.println(d2);

        int i2 = d2.intValue(); // unboxing and narrowing
        System.out.println(i2);

        System.out.println("---- unboxing and explicit narrowing --");
        int i3 =  (int) d2.doubleValue(); //unboxing
               //explicit narrowing
        System.out.println(i3);


        byte b = 123;

        long l = 100; // auto widening

        Byte bb = (byte) l;
        System.out.println(bb);

        System.out.println("-------------- imp ----------------");
        Orange o1 = new Orange();
       // d = o1 // not possible to object to primitive
       // String s1 = o1 ; cte not related objects

        String s1 = o1.toString(); // possible because toString method returns String and assign to s1;
        System.out.println(s1);

        double d3 = 12.33;
        Double dd = d3;
        d3 = dd.doubleValue(); // unboxing
        d3 = dd; // since jdk 1.8 is possible compiler automatically calls the dd.doubbleValue();

       // Character ch = new Character('A'); // deprecated
        Character ch = 'A';
        System.out.println(ch);

        ch = (char)100;
        System.out.println(ch);

        Character ch2 = 'B';
        char ch3 = ch2.charValue();
        System.out.println(ch3);

        char ch4 = ch2; // unboxing compiler implicitely call the ch2.charValue()
        System.out.println(ch4);
        // we cannot assign a reference var to primitive variable

        Long l2 = 100L;

        System.out.println("---- converting Object to String ---");
        String s = l2.toString();
        System.out.println(s);


        Double dd1 = 100.00;
        String ds = dd1.toString();
        System.out.println(ds);
        String ds2 = Double.toString(12.12); // premitive to string conversion
        System.out.println(ds2);

        System.out.println(Long.toString(100L));
        System.out.println(Byte.toString((byte) 100));


        // add two string containing numbers and put it in another string

        String s2 = "123";
        String s3 = "456";

        int val = Integer.parseInt(s2); // PareINt will convert your String value to int value
        int val2 = Integer.parseInt(s3);
        int val4 = val+val2;


        String s4 = Integer.toString(val4);
        System.out.println(s4);


        Integer ii4 = 123;
        Integer ii5 = ii4; // assigining the address
        System.out.println(ii4 == ii5);

        Integer ii6 = Integer.valueOf(100);
        // this will return an new object of Integer







    }
}
