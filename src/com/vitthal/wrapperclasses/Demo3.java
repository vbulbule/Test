package com.vitthal.wrapperclasses;

public class Demo3 {
    /*
                                                 Y Axis
                                                  |
                                                  |
        byte               short              int |              long        float          double
    ---------------------------------------------------------------------------------------------> X Axis
                                                  |
    1. Double d1 = new double(10) is it valid?

    Ans : Yes. it is valid. we are passing the int value to the double so at las it becomes autowidening so it is absolutely right

    2. Integar i1 = new Integer(33.33) is it valid?

    Ans : No its not valid we are passing the double value but it stores as integer so
          compiler shows error coz we are assign bigger to smaller



                     Object
                       |
                     Number
                       |
     Byte  | Short | Integer | Long | FLoat | Double


     Wrapper class

     1. Present under java.lang
     2. Two constructors for each wrapper class except character class (Only one constructor)
     3. toString(), equals(), and hashcode() method is overriden
     4. Every nummber related to wrapper class inherit from super class Number (abstract class).
     It is inherited from object class. The number class methods are overriden in every wrapper class whicchi is deals with nummber






     */
}
