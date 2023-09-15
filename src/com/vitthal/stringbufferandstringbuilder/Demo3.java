package com.vitthal.stringbufferandstringbuilder;

public class Demo3 {

    /*

    String class of java.lang(package) is used to store the string object

    1. A String object can be created either by using new keyword or direct assgnment of the string literal
    2. WWhenever a string object is created with help of string literal the objects are created in the constant
       pool doesn't allow duplicate objects
    3. if the objects are created with new keyboard then the objects will be created in non constant pool
    4. if same objects is being created in the constant pool the object will be created only once and all
       the reference variables will be pointing to the same object however in non constant pools the
       referencce variable will be pointing to different object (new object) of the same string
    5. The String object is immutable object since we cannot change the objects value
    6. in the string class toString() method and equals() method are overriden
    7. the comparision of two string object is done based on value of the object (first address is compared if
    it returns false then value is compared)
    8. In order to compare wrt string values use equals() metthod
    9. from JDK 1.5 onwards two additional classes called String builder and String buffer class have been
      introduced this class can be used to create string object using any of these classes we can create object
      with the help of new keyword
    10. the method of String buffer classes give synchronized method
    11. reverse, insertm delete, methods avaliable in SBuilder and SBuffer
     */
}
