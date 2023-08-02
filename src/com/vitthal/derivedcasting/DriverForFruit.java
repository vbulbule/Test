package com.vitthal.derivedcasting;

public class DriverForFruit {

    public static void main(String[] args) {
        /**
         * Object // supermost parent class
         * Fruit -> Object
         * Apple -> Fruit
         * OttyCHeApple -> Apple
         */



        Fruit f = new Fruit();
        Execution.start(f); /**
         when we call the start method and start method require the type Fruit and f is nothning but reference variableof Fruit
         so the start method will be continue execution with the if condition as true and procced further and we get
         output as : test() method of class Fruit

         */
        Execution.start(new Fruit());

        Execution.start(null); // null object will be passed so in start method condition will fail

        Apple a1 = new Apple();
        Execution.start(a1);  // Fruit f = new Apple() // upcasting
        /**
         * when we call the start method and start method need Fruit Object but here we have passed the Object of Apple a1
         * and when the method start will call the compiler will upcast the Apple object as : Fruit f = new Apple();
         * and in start start method we are checking the F is instance of Fruite the condition will be true because
         * Passed Apple object is Upcasted to Fruit
         * and when the f.test() method will be called compiler will check if theere is any overriden method of test()
         * in passed Apple Object if yes then Apple class's Overriden method will be called
         * thats why we get Output as : test() method of class Apple even tho Apple object is upcasted to Fruit because of
         * method overriden
         *
         */
        Execution.start(new Apple());

        OttyCheApple o1 = new OttyCheApple();
        Execution.start(o1);
        Execution.start(new OttyCheApple());




        // public static void start(Fruit f){
       /* Execution.start(new Fruit());

        Execution.start(new Apple());

        // start(Fruit f)
        Fruit f1 = new OttyCheApple();
        f1.test();*/


    }
}
