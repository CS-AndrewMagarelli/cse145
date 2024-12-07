//Andrew Magarelli
package ball;
import java.util.Scanner;

public class triangleheight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the height of the triangle
        System.out.print("Please enter the height of the triangle: ");
        int height = scanner.nextInt();

        // Draw the triangle
        for (int i = 1; i <= height; i++) {
            // Print _# asterisks for the ascending part
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = height - 1; i >= 1; i--) {
            // Print _# of asterisks for the descending part
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // End of the program
        System.out.println("End of program!");

        // Close the scanner
        scanner.close();
    }
}