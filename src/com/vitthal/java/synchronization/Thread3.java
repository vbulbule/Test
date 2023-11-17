package com.vitthal.java.synchronization;

public class Thread3 extends Thread{

    Power p;

    Thread3(Power p){
        this.p=p;
    }

    @Override
    public void run() {
      p.printPower(3);
    }


}
