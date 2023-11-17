package com.vitthal.java.iostream;

import java.io.IOException;

public class JavaIO {
    /*
    Java I = input, O output

    Java I/O (input and output ) is used to process the input and produce the output

    Java Uses the concept of "stream" to make IO oprtaion fast
    The java.io package contains all the classes required for input and output

    We can perform the file handling in java by java I/o API

    In general Streams means the continue flow of data


    -Stream:
    A stream is a sequence of data. In java a stream is composed of bytes.
    It is called stream because it is like stream of water that contineous to flow

    in java 3 streams are automatically created for us all of these streams are related to console

    1. System.out : standard output stream
    2. System.in : standard input stream
    3. System.err : standard error stream

    -out
    System.out.println("Sample message");
    -err
    System.err.println("Sample err")
    -in
    int i = System.in.read();
    System.out.println((char)i);



    InputStream vs OutputStream

    -OutputStream
    Java Application uses an output stream to "write" data to destination, it may be filed, or an array , Peripheral
    device or socket

    -InputStream
    Java Application uses an input stream to "read" data from source, it may be filed, or an array , Peripheral
    device or socket

    -OutputStream Class
     OutputStream class is an abstract class.
     It is the super class of all classes representing an output stream of bytes

     Methods of OutputputStream
     1. public void write(int) throws IOException : is used to write a byte to the current o/p stream
     2. public void write(byte[]) throws IOException : is used wo write an array of byte to the current output
                                                       stream
     3. public void flush() throws IOException : flushes the current output stream
     4. public void close() throws IOException : is used close the current output stream

     OutputStream Hierarchy


     Input stram class
     InputStream class is an abstract class.
     It is the superclass of all classes representing an input stream of bytes.
     Methods of OutputputStream
     1. public abstract int read() throws IOException : reads the next byte of data from the input stream
                                                        it returns -1 at the end of file
     2. public int avaliable() throws IOException : returns an estimate of the number of bytes that can be
                                                    read from the current input stream
     3. public void close() throws IException : it is used to close the input stream

     -InputStream Hierarchy





     */
    public static void main(String[] args) throws IOException {

        System.out.println("Amruta is good girl");
        System.err.println("Vitthal is innocent");

        int i = System.in.read();
        System.out.println((char)i);
    }

}
