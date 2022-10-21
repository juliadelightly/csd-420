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

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class DelightlyAssignment1 {
     public static void main (String[]args) throws IOException {

        // set to true to append 
        try (PrintWriter output = new PrintWriter(new FileOutputStream("DelightlyDataFile.dat", true))) {

            // creates date format to add to file
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
            String dateStr = formatter.format(date);
            output.println("\nToday's date is:\n" + dateStr);

            // creates array of 5 random integers
            output.print("\nFive Random Integers:\n");
            Random randInt = new Random();
            int[] intArray = new int[5];
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = randInt.nextInt();
                output.println(intArray[i]);
            }

            // creates array of 5 random doubles
            output.println("\nFive Random Doubles:");
            Random randDouble = new Random();
            double[] doubleArray = new double[5];
            for (int i = 0; i < doubleArray.length; i++) {
                doubleArray[i] = randDouble.nextDouble();
                output.println(doubleArray[i]);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
