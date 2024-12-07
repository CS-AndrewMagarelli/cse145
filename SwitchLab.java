package ball;
import java.util.Scanner;
public class SwitchLab {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        int booksPurchased;
        
        // Prompt user for the number of books purchased
        System.out.print("How many books did you purchase at BN booksellers this month? ");
        
        // Validate input
        while (true) {
            if (scanner.hasNextInt()) {
                booksPurchased = scanner.nextInt();
                if (booksPurchased > -1) {
                    break; // Valid input
                } else {
                    System.out.print("Invalid value entered! Exiting the program! ");
                    System.exit(booksPurchased);
                }
            
            }
        }

        
        int pointsEarned;
        //Check if user input is 0 and exit program
        if (booksPurchased == 0) {
        System.out.println("You have not earned any points yet. Make a book purchase to start earning points!");
        System.exit(0);
        }
        
     // Determine points earned using a switch statement
        switch (booksPurchased) {
            
        
        	case 1:
                pointsEarned = 5;
                break;
            case 2:
                pointsEarned = 15;
                break;
            case 3:
                pointsEarned = 30;
                break;
            default:
                pointsEarned = 60; // For 4 or more books
                break;
        }

        // Display the points earned
        System.out.println("Congratulations!!! You have earned " + pointsEarned + " points!");
        System.out.println("You may redeem these points on your next book purchase!");
        scanner.close();


	}

}
