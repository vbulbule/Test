package com.vitthal.java.iostream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    /*

    Java FIleOutputStream

    is an output stream used for writing data file

    if you have to write thr primitive values into file use FIleOutputStream class
    YOu can write byte oriented as well as character oriented data through "FIleOutputStream" class
    But for Character oriented data it is preferred to use the "FileWriter" than FileOutputStream

    FIleOutputStram Class declaration

    public class FileOutputStream extends OutputStream

    Methods of FileOutputStream

    1.Protected void finalize() : it is used to clean up the connection with the file output
    2.void Write(byte[] ary) : it is used to write ary.length bytes from the byte array to the file output stream
    3.void write(byte[] ary, int off, int len) : it is used to write "len" bytes from the byte array starting at
                                                 offser off to the file output stream
    4.void write(int b) : it is used to write the specified byte to the file output stream
    5. FineChannel getChannel() : it is used to return the file channel object associaed with the file output strem
    6. FileDescripter getFD() : it is used to return the file descripter associated to the stream
    7. void close() : it is used to close the stream

     */

    public static void main(String[] args) throws IOException {
        FileOutputStream fout = null;
        try {

            fout = new FileOutputStream("C:\\Users\\vitbulbu\\IdeaProjects\\Test\\resources\\outputstreamdemo1.txt");
            //fout.write(65); // to write the single byte

            // to write the String into the file
            String s = "Amruta is not good in java she is still learning !!!!!";

            byte[] bytes = s.getBytes();
            fout.write(bytes);

            System.out.println("Success...");

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            fout.close();
            System.out.println("fout is closed..!");
        }
    }
}
