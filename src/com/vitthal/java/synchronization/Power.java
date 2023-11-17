package com.vitthal.java.synchronization;

public class Power {


    /*synchronized void printPower(int n){ // synchronized void method
        int temp=1;

        for(int i =1;i<=5;i++){

            System.out.println(Thread.currentThread().getName()+ ":- "+n+"^"+i+" value "+ n*temp);
            temp = n*temp;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }*/

    // to understand the synchronized block
/*    void printPower(int n) {
        //this : refers to current class object
        synchronized (this){
            int temp = 1;
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ":- " + n + "^" + i + " value " + n * temp);
                temp = n * temp;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        *//*
       in this example, we didn’t synchronize the entire method but we synchronized few lines of code in the method.
       We got the results exactly as the synchronized method.
         *//*
    }*/


    //program with static synchronization
    synchronized static void printPower(int n) {
        int temp = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ":- " + n + "^" + i + " value " + n * temp);
            temp = n * temp;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }


}
