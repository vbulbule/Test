package com.vitthal.wrapperclasses;

public class Demo1 {
    /*

    Primitive type :
    byte, short, int, long float, double, char, blloean

    Wrapper class : converting primitive type to Object is called Wrapper class

    byte : Byte
    short : Short
    int : Integer
    long : Long
    flot : Float
    double : Double
    char : Character
    boolean : Boolean

    since they wrap around the primitives so it is called wrapper class

    1. converting primitive type into object is called as auto boxing (compiler does it)
    2. converting an object (which is created from auto boxing ) to primitive
       type is called un boxing (developer does it)

    In both cases we use the wrapper class for every primitive type respective wrapper class is given by JDK

    Every wrapper class will have the overloaded constructor (except character class)
    they do not use the default constructor in wrapper class

    Note : Generally wheneever a reference variable is printed the ddress of the object will be printed.
    the address usually represented with fully qualified class name : fully qualifiedname@hexadecimal address

    Whenever reference of any wrapper class is used or printed then it prints the primitive data of the wrapper class
    insted of address because in every wrapper class toString() method of the object class has been overriden to display
    or return the primitive data insted of object


     */

    public static void main(String[] args) {

     Fruit f = DumDum.getFruit();
     System.out.println(f.getClass().getName());
    }
}
