package com.vitthal.java.collection;

public class Apple implements Fruit{

    int wt; // class non static variable
    public Apple(int wt){
        this.wt=wt;
    }
    public Apple(){

    }

    public boolean equals(Object obj) {
      if(obj == null)
          return false;
      if(this == obj)
          return true;
      if(obj instanceof Apple)
          return this.wt == ((Apple) obj).wt;

      return false;
    }

    public int hashCode() {
       return 7*5*wt; // some random integer
    }
}
