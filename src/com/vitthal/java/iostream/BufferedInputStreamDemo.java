package com.vitthal.java.iostream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    /*
    Java BufferedInputStream class is used to read information from stream.
    It internally uses buffer mechanism to make the performance fast.


    -When the bytes from the stream are skipped or read,
     the internal buffer automatically refilled from the contained input stream, many bytes at a time.
    -When a BufferedInputStream is created, an internal buffer array is created.
     */

    public static void main(String[] args) throws IOException {

        FileInputStream fin = null;
        BufferedInputStream bin = null;
        try {
            fin = new FileInputStream("C:\\Users\\vitbulbu\\IdeaProjects\\Test\\resources\\inputstreamdemo.txt");
            bin= new BufferedInputStream(fin);
            //int i = fin.read();
            //System.out.println((char) i); // for single characher
            // for printing the string
            int i =0;
            while (( i = bin.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            bin.close();
            fin.close();
        }


    }
}
