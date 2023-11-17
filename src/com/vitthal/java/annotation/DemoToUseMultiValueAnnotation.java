package com.vitthal.java.annotation;

public class DemoToUseMultiValueAnnotation {
    @MultiValueAnnotation(value1 = 10, value2 = "Test",value3 = "Test2")
    public void print(){
        System.out.println("Amruta");
    }
}
