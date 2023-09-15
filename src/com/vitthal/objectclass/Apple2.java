package com.vitthal.objectclass;

public class Apple2 {

    int wt;

    Apple2(int wt){
        this.wt = wt;
    }

    public String toString(){

        return "wt : "+ wt;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)  // condition for check the reference variable points towards null
            return false;
        if(this == obj) // to check the ref var of the obj is belongs to the same class or not
            return true;
        if(obj instanceof Apple2) // to check the obj is instance of apple or not
                                  // if it false then it belongs to another type
            return this.wt == ((Apple2)obj).wt;

        return false;

    }
}
