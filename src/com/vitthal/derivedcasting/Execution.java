package com.vitthal.derivedcasting;

public class Execution {

    public static void start(Fruit f){

        if(f instanceof Fruit)
            f.test();
        else
            System.out.println("f is not instance of Fruit");
    }


}
