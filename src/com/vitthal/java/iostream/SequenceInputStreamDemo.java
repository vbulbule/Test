package com.vitthal.java.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemo {
  /*
   Java SequenceInputStream class is used to read data from multiple streams.
   It reads data sequentially (one by one).

 */
  public static void main(String[] args) throws IOException {

      FileInputStream input1 = new FileInputStream("C:\\Users\\vitbulbu\\IdeaProjects\\Test\\resources\\inputstreamdemo.txt");
      FileInputStream input2 = new FileInputStream("C:\\Users\\vitbulbu\\IdeaProjects\\Test\\resources\\inputstreamdemo2.txt");
      SequenceInputStream sq = new SequenceInputStream(input1,input2);
      int i =0;
      while (( i = sq.read())!=-1){
          System.out.print((char)i);
      }
      sq.close();
      input1.close();
      input2.close();

  }
}
