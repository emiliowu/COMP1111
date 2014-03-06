package q4;

import java.util.Scanner;

/**
 * <p>This is program asks user for a radius and
 * height input, then calculates the volume of a
 * cylinder and prints out the results.</p>
 *
 * @author Emilio Wu
 * @version 1.0
 */
public class Cylinder {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        // Declaring variables and constants
        final double radius;
        final double height;
        final double pi;
        final double volume;
        final double power = 2;
        
        // Assigning the pi constant
        pi = Math.PI;
        
        Scanner scan = new Scanner(System.in);
        
        // Ask for user inputs
        System.out.print("Please enter the radius of your"
                + " cylinder in meters: ");
        radius = scan.nextDouble();
        
        System.out.print("Please enter the height of your"
                + " cylinder in meters: ");
        height = scan.nextDouble();
        
        scan.close();
        
        // Calculations
        volume = pi * Math.pow(radius, power) * height;
        
        // Prints out the results
        System.out.println("The volume of your cylinder is: "
                + volume + " cubic meters.");
        
        System.out.println("\nQuestion four was called and ran sucessfully.");
    }

};
