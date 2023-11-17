package com.vitthal.java.iostream;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamClassDemo {
    /*

    The ByteArrayInputStream is composed of two words : ByteArray and InputStream.
    As the name suggests it can be used to read byte array as input stream
    ByteArrayInputStream class contains na internal buffer which is used to read byte array as stream
     */
    public static void main(String[] args) {

        byte[] bytes = {67, 34, 12, 43, 12, 43,23,13,1,3,12, 35, 36,37,38};

        // create stream of byte array

        ByteArrayInputStream byt = new ByteArrayInputStream(bytes);

        int k =0;
        while ((k=byt.read())!= -1){
            char ch = (char) k;
            System.out.println( "ASCII val of :"+k+" is :"+ch);
        }

    }

}
