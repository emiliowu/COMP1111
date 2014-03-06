package q3;

import java.util.Scanner;

/**
 * <p>This program will ask for a temperature input in 
 * Fahrenheit and then convert it to Celsius.</p>
 *
 * @author Emilio Wu
 * @version 1.0
 */
public class TempConvert {

    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        // Declaring variables and constants
        double degreeF;
        double degreeC;
        final int a = 32;
        final int b = 5;
        final int c = 9;
        
        Scanner scan = new Scanner(System.in);
        
        // Ask for user inputs
        System.out.print("Please enter a temperature in Fahrenheit: ");
        degreeF = scan.nextDouble();
        
        scan.close();
        
        // Calculation
        degreeC = (degreeF - a) * b / c;
        
        // Prints out results
        System.out.println("" + degreeF + " degree(s) Fahrenheit "
                + " equals to " + degreeC + " degree(s) Celsius.");
        
        System.out.println("\nQuestion three was called and ran sucessfully.");
    }

}
