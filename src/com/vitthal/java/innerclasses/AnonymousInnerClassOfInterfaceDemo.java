package com.vitthal.java.innerclasses;

public class AnonymousInnerClassOfInterfaceDemo {

    public static void main(String[] args) {

        Animal a = new Animal() {
            @Override
            public void hasTails() {
                System.out.println("Dog has tail");
            }
        };

        a.hasTails();
    }
}
