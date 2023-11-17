package com.vitthal.java.iostream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    /*

    Java FileInputStream Class

    Java FileInputStream class obtains input bytes from a file.
    It is used for reading byte oriented data (stream of raw bytes) such as image, data, audio, video etc.
    You can also read character -stream data, but for reading characters it is recommended to use the "FileReader"

    FIleOutputStram Class declaration

    public class FileInputStream extends InputStream

    methods of FileInputStream

    - int avaliable() : it is used to return the estimate number of byte that can be read from the input
    - int read() : it is used to read the byte data from the input stream
    - int read(byte [] b) : it is used to read upto b.length bytesfrom the input
    - int read(byte[] b, int off, int len) : it is used to read upto len
    - long skip(long x) : it is used to skip over and discards x bytes from the input stream
    - void close() : it is used to close the stream

     */
    public static void main(String[] args) throws IOException {

        FileInputStream fin = null; // declaration gobal of main so i can use the fin variable all over places
                                     //like in try,catch and finally blocks
        try {
            fin = new FileInputStream("C:\\Users\\vitbulbu\\IdeaProjects\\Test\\resources\\inputstreamdemo.txt");
            //int i = fin.read();
            //System.out.println((char) i); // for single characher
            // for printing the string
            int i =0;
            while (( i = fin.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            fin.close(); // after every reading i want to close the stream and irrespective of pass or fail
                         // i need to close so finally block is the block which is executing every time no matter
                         //what your code does
        }
    }
}
