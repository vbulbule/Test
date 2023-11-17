package com.vitthal.java.annotation;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ClassTypeAnnotation { // wanted to use for class
    int value1();
    String value2();
}
