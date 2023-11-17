package com.vitthal.java.objectclass;

public class MuskMeloan {

    int wt;

    MuskMeloan(int wt)
    {
        this.wt = wt;

    }

    public String toString(){
        return "wt : "+wt;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj == null)
           return false;
       if (this == obj)
           return  true;
       if(this.wt == ((MuskMeloan)obj).wt)
           return true;

       return false;
    }

    public int hashCode(){
        return wt * 12 * 10;
    }
    /*
    using this hashcode overriden we can change the address but it not changes the System address
    of that object system address will be always different

    NOTE: ref var of M1 and M3 will have same hashcode after overriding hashcode()
    that does not mean both refer to same object

    NOtes :
    1. When two objects (of same type) are equal their hashcode should same but when hashcode of two objects(different)
    are same then the objects need not be equal
    in other words two different objects can be in same bucket (can have same hashcode)
    i.e when you override equal method of class we should also override hashcode method

    WHen you override a hashcode method and if you want to print the same address will be print for that object
    but if you want to print the original hashcode then you can print is
    using : System.identityHashcode(refVariable);



     */

}
