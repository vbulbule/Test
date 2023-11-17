package com.vitthal.java.iostream;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
    /*
    Java ByteArrayOutputStream class is used to write common data into multiple files
    in this stream tha data is written into a byte array which can be written in to the multiple strems later

    The ByteArrayOutputStream holds a copy of data and forwards it to multiple streams.

    The buffer of ByteArrayOutputStream automatically grows according to data
     */
    public static void main(String[] args) throws IOException {
        FileOutputStream fout1 = new FileOutputStream("C:\\Users\\vitbulbu\\IdeaProjects\\Test\\resources\\outputstreamdemo1.txt");
        FileOutputStream fout2 = new FileOutputStream("C:\\Users\\vitbulbu\\IdeaProjects\\Test\\resources\\outputstreamdemo2.txt");
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        String val = "Vitthal is very very hungry";

        byte[] bytes = val.getBytes();

        //bout.write(65);//A
        bout.write(bytes);
        bout.writeTo(fout1);
        bout.writeTo(fout2);

        bout.flush();
        bout.close();
        System.out.println("Success ...!");

    }
}
