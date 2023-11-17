package com.vitthal.java.annotation;

public class AnnotationDemo {
    public static void main(String[] args) {

        /*
        Java Annotations
        Java Annotation is tag that represents the metadata
        that is attached with class, interface, methods or fields to indicate some additional information
        which can caused by java compiler or JVM



        Inbuild ANnotations - java has alrady defined some annoations
        Custom annotations - user defined annotations

        in-build annotations used in java code
        -@Override
        -@SupressWarnings
        -@Deprecated

        Builtin annotations used in creation of custom annotation
        -@Target
        -@Retention
        -@Inherited
        -@Documented


        Understanding Build-in Annotations
        @Override
        @Override annotation assures that the subclass method is overriding the parent class method.
        If it is not so, compile time error occurs.
        Sometimes, we does the silly mistake such as spelling mistakes etc. So, it is better to mark
        @Override annotation that provides assurity that method is overridden.


        @SuppressWarnings
        @SuppressWarnings annotation: is used to suppress warnings issued by the compiler.

        @Deprecated
        @Deprecated annoation marks that this method is deprecated so compiler prints warning.
        It informs user that it may be removed in the future versions. So, it is better not to use such methods.


        Java Custom Annotations

        Java Custom annotations or Java User-defined annotations are easy to create and use.
        The @interface element is used to declare an annotation.
        For example:
        @interface MyAnnotation{}

        There are few points that should be remembered by the programmer.

        Points to remenber for java custom annotations signature
        1. Method should not have any throws class
        2. Method should return one of the following  primitive data types, String, Class, enum or array of these
        data types
        3. Method should not have any parameters
        4. We should attach @ just before interface keyword to define annotation
        5. it may assign a default value to the method

        Types of annotations
        there are three types of annotation

        1. Marker Annotation
        2. Single value annotation
        3. Multi value annotation

        1. Marker Annotation
        An annotation that has no method, is called marker annotation
        For example:
        @interface MyAnnotation{}
        the @Override and @Deprecated are marker annotations

        2. Single Value Annotation
        An annotation that has one method, is Single Value Annotation

        -For example :
        public @interface SingleValueAnnotation {
        int value();
        }

        -We can provide the default value also
        public @interface SingleValueAnnotation {
        int value() default 20;
        }

        -How to apply single value annotaiton
        @SingleValueAnnotation(Value = 10)
        public void print(){
        System.out.println("Amruta");
        }

        3. Multi-Value Annotation
        An annotation that has more than one method, is called Multi-Value annotation.
        For example:

        public @interface MultiValueAnnotation {
        String value2();
        String value3();
        int value1();
        }
        -We can provide the default value also for example
        public @interface MultiValueAnnotation {
        String value2() default "Amruta";
        String value3() default "Vitthal";
        int value1() default 30;
        }
        - How to apply Multi-Value Annotation
          @MultiValueAnnotation(value1 = 10, value2 = "Test",value3 = "Test2")
          public void print(){
          System.out.println("Amruta");
          }
          }


       Built-in Annotations used in custom annotations in java
        -@Target
        -@Retention
        -@Inherited
        -@Documented



        @Terget
        - @Target tag is used to specify at which type, the annotation is used.
        The java.lang.annotation.ElementType enum declares many constants to specify the type of
        element where annotation is to be applied such as TYPE, METHOD, FIELD etc.
        Let's see the constants of ElementType enum:
        ELementTypes
        TYPE : class, interface or enum
        FIELD : fields
        METHOD : mthods
        CONSTRUCTOR : Constructor
        LOCAL_VARIABLE : local variable sathi
        ANNOTATION_TYPE : annotation types
        PARAMETERS : parameers

        For Example:
        @Target(ElementType.TYPE)
        public @interface ClassTypeAnnotation { // wanted to use for class
        int value1();
        String value2();
        }
        How to use -
        @ClassTypeAnnotation(value1 = 20,value2 = "vitthal")
         public class A {

          }

          -Example to specify annotation for class,methods or fields
          @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
          @interface MyAnnotation{
          int value1();
          String value2();
           }
           - this above menetioned MyAnnotation can be used for CLass (ElementType.TYPE),
             fields (ElementType.FIELD) and methods (ElementType.METHOD)


        -@Retentioan
        @Retention annotation is used to specify to what level annotation will be available.
        Policis:
        RetentionPolicy.SOURCE : refers to source code, discarded during compilition
                                 and it will not be avaliabe in the compiled class
        RetentionPolicy.CLASS : refers to the .class file, avaliabe to java compiler but not to JVM
                                it is included in class file
        RetentionPolicy.RUNTIME : refers to runtime , avaliable to java compiler and JVM

        -Example to specify the retentionPolicy
        @Retention(RetentionPolicy.RUNTIME)
        @Target(ElementType.TYPE)
        public @interface ClassTypeAnnotation { // wanted to use for class
        int value1();
        String value2();
        }


        @Inherited
        By default, annotations are not inherited to subclasses.
        The @Inherited annotation marks the annotation to be inherited to subclasses.

        FOr example :
        @Inherited
        @interface ForEveryone { }//Now it will be available to subclass also

        How to use
        class Superclass{}

        class Subclass extends Superclass{}


        @Documented
        The @Documented marks the annotation for inclusion in the documentation

        For example:
        @Documented
        public @interface ThisIsDocumented {
        }

        How to use :
        @ThisIsDocumented
        public class VitthalIsNiceBoy {
        }


         */



    }
}
