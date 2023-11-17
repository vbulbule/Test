package com.vitthal.java.annotation;

public @interface MultiValueAnnotation {

   String value2() default "Amruta";
   String value3() default "Vitthal";

    int value1();
}
