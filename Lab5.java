//Andrew Magarelli
package ball;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("How many dollars would you like to spend on chocolate from the vending machine? ");
        
        int dollars = scanner.nextInt();
        if (dollars < 0) {
        	System.out.println("That is an invalid input, please re-run the program and try again");
        	System.exit(0);
        }
      
        int chocolateBars = dollars; // Each chocolate bar costs $1
        int coupons = chocolateBars; // Start with the same number of coupons as chocolate bars

        // Redeem coupons for additional chocolate bars
        while (coupons >= 6) {
            int additionalBars = coupons / 6; // Calculate how many additional bars can be redeemed
            chocolateBars += additionalBars; // Increase total chocolate bars
            coupons = coupons % 6 + additionalBars; 
        }

        // Output results
        System.out.println("You can buy " + chocolateBars + " chocolate bars and will have " + coupons + " coupons left!");

        // Close the scanner
        scanner.close();
    }
}