package com.vitthal.java.iostream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
    /*

    java buffered output stream class is used for Buffering an output stream.
    it internally uses the buffer to store the data
    thats why it adds more efficiency that to write it directly into stream so it makes performance fast



     */

    public static void main(String[] args) throws IOException {

        FileOutputStream fout = null;
        BufferedOutputStream bout = null;
        try {

            fout = new FileOutputStream("C:\\Users\\vitbulbu\\IdeaProjects\\Test\\resources\\outputstreamdemo1.txt");
            bout = new BufferedOutputStream(fout); // adeded the buffer layer to
                                                           // store the data efficiently

            //fout.write(65); // to write the single byte

            // to write the String into the file
            String s = "Amruta is not good in java she is still learning !!!!!";

            byte[] bytes = s.getBytes();
            bout.write(bytes);
            bout.flush();

            System.out.println("Success...");

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {

            bout.close();
            fout.close();
            System.out.println("fout nad bout is closed..!");
        }
    }

}
