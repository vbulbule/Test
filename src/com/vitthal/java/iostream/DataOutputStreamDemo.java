package com.vitthal.java.iostream;

import java.io.*;

public class DataOutputStreamDemo {
    /*
    DataOutputStream it allows an application to write the primitive data types to the output stream
     in machine -independent way

     methods
     -int size() : retun the number of bytes written to the data o/p stream
     - void write(int b) : it is used to write the specified byte to the underlying stream
     - void write(byte[] b, int off, int len) : used to write hte len vytes data to op
     - void writeBoolean(boolean bln) : useed to write the boolean data as 1- byte stream
     - void writeChar(int v) : it is used ti write the char to the output stream as 2 bytes value
     - void writeChars(String s) : it is used to write the String to the o/p stream as sqquence of chara
     - void writeByte(int v) :  It is used to write a byte to the output stream as a 1-byte value.
     - void writeBytes(String s) : It is used to write string to the output stream as a sequence of bytes.
     - void writeInt(int v) : It is used to write an int to the output stream
     - void writeShort(int v) : It is used to write an short to the output stream
     - void writeLong(long v) : It is used to write an Long to the output stream
     - void writeUTF(String str) : It is used to write a string to the output stream
                                 using UTF-8 encoding in portable manner.
     - void flush() : It is used to flushes the data output stream.



     -DataInputStream
     Java DataInputStream class allows an application to read primitive data from the
     input stream in a machine-independent way.

     Java application generally uses the data output stream to write data
     that can later be read by a data input stream.

     same methods are present for Data Input stream just use the read instead of write



     */

    public static void main(String[] args) throws IOException {

        //DataOutputStream
        FileOutputStream os = new FileOutputStream("C:\\Users\\vitbulbu\\IdeaProjects\\Test\\resources\\dataoutputstreamdemo.dat");
        DataOutputStream dout = new DataOutputStream(os);

        dout.writeDouble(1.20);
        dout.writeInt(13);
        dout.writeBoolean(true);
        dout.writeChar('6');

        dout.writeUTF("Vitthal");

        dout.flush();
        System.out.println("Success.....!");


        // Data Input stream
        FileInputStream fis = new FileInputStream("C:\\Users\\vitbulbu\\IdeaProjects\\Test\\resources\\dataoutputstreamdemo.dat");
        DataInputStream dis = new DataInputStream(fis);

        double a = dis.readDouble();
        int b= dis.readInt();
        boolean c = dis.readBoolean();
        char d = dis.readChar();

        String val = dis.readUTF();

        System.out.println(a+" "+ b+" "+ c+ " "+d +" "+val );


    }


}
