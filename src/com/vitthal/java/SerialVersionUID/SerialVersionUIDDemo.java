package com.vitthal.java.SerialVersionUID;

public class SerialVersionUIDDemo {

    /*
    -SerialVersionUID

    The serilization process at runtime associates an ID with each serializable class which is known as
    SerialVersionUID.
    It is used to verify the sender and receiver of the serial Object
    the Sender and receiver must be same. to verify it SerialVersionUID is used.
    THe sender and receiver must have the same SerialVersionUID, otherwise InvalidClassException
    will be thrown when you deserialize the object.
    We can also declare our own SerialVersionUID in the serializable class.
    TO do so you need to create the field SerialVersionUID and assign a value to it
    It is suggested to explicitely declare the SerialVersionUID field in the class and have it private also.
    FOr example :
    private static final long SerialVersionUID = 1L;

     */
}
