package com.vitthal.java.annotation;

import java.util.ArrayList;

public class AnnotationDemo2 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("vitthal");
        list.add("tejas");
        System.out.println(list);

        AnnotationDemo2 d2 = new AnnotationDemo2();
        d2.amrutaDholi();
        /*
        If you remove the @SuppressWarnings("unchecked") annotation, it will show warning
        at compile time because we are using non-generic collection.
         */
    }

    @Deprecated
    public void amrutaDholi(){

        System.out.println("Amruta dholi ahe");
    }
}
