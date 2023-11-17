package com.vitthal.java.objectclass;

public class Apple {

    int wt;

    Apple(int wt){
        this.wt = wt;
    }

    public String toString(){
        return "wt : "+wt;
    }

    public boolean equals(Object o){

        /*
        Apple a1 = new Apple ();

        ((Apple)o) ==== a1
        a1.wt

         */
        if(this.wt == ((Apple)o).wt)
            return true;
        else
            return false;
    }
}
