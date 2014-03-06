package q2;

/**
 * <p>This is program calculates a time (hours/minutes/seconds)
 *  into total seconds.</p>
 *
 * @author Emilio Wu
 * @version 1.0
 */
public class SecondsConvert {
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        // The test time
        System.out.println("Here's a test time: 2 hours "
                + "24 minutes and 55 seconds.");
       
        // Declaring constants
        final int hours = 2;
        final int minutes = 24;
        final int seconds = 55;
        final int hoursSec;
        int minsSec;
        int secsSec;
        final int mins = 60;
        final int secs = 60;
       
        // Calculations
        hoursSec = hours * mins * secs;
        minsSec = minutes * secs;
        secsSec = hoursSec + minsSec + seconds;
       
        // Prints out results
        System.out.println("The random time has " + secsSec + " seconds.");
        
        System.out.println("\nQuestion two was called and ran sucessfully.");
    }

};
