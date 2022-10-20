/**
 * Julia Delightly
 * CSD420
 * Professor Payne
 * Module 1 Assignment
 * 
 * This program will store:
 * - An array of five random integers
 * - A Data objective instance using the current date
 * - An array of five random double values
 * 
 * and
 * 
 * Append the data in DelightlyDataFile.dat
 */

import java.io.FileInputStream;
import java.io.IOException;

public class DelightlyAssignment1_Part2 {
      public static void main (String[]args) throws IOException{

        try{
            FileInputStream fis = new FileInputStream("DelightlyDataFile.dat");

            int i = 0;
            while((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

            fis.close();
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    
}
