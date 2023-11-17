package com.vitthal.java.synchronization;

public class Thread1 extends Thread{

    Power p;

    Thread1(Power p){
        this.p=p;
    }

    @Override
    public void run() {
      p.printPower(5);
    }


}
