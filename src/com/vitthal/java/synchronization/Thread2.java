package com.vitthal.java.synchronization;

public class Thread2 extends Thread{

    Power p;

    Thread2(Power p){
        this.p=p;
    }

    @Override
    public void run() {
      p.printPower(8);
    }


}
