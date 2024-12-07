//Andrew Magarelli
package ball;
import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        
        System.out.println("Welcome to the Choose Your Own Adventure game!");
        System.out.println("You find yourself at a fork in the road. Do you want to go left or right?");
        
        choice = scanner.nextLine().toLowerCase();
        
        if (choice.equals("left")) {
            leftPath(scanner);
        } else if (choice.equals("right")) {
            rightPath(scanner);
        } else {//Ends program if an invalid answer is submitted
            System.out.println("Invalid choice. Game over.");
        }
        
        scanner.close();
    }

    private static void leftPath(Scanner scanner) {
        System.out.println("You walk down the left path and encounter a river. Do you want to swim across or walk along the bank?");
        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("swim")) {
            swimAcross(scanner);
        } else if (choice.equals("walk")) {
            walkAlongBank(scanner);
        } else {//Ends program if an invalid answer is submitted
            System.out.println("Invalid choice. Game over.");
        }
    }

    private static void rightPath(Scanner scanner) {
        System.out.println("You walk down the right path and find a mysterious cave. Do you want to enter the cave or continue walking?");
        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("enter")) {
            enterCave(scanner);
        } else if (choice.equals("continue")) {
            continueWalking(scanner);
        } else {//Ends program if an invalid answer is submitted
            System.out.println("Invalid choice. Game over.");
        }
    }

    private static void swimAcross(Scanner scanner) {
        System.out.println("You swim across the river but are caught in a strong current. Do you want to fight the current or give up?");
        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("fight")) {
            System.out.println("You manage to reach the other side safely! Congratulations, you win!");
        } else if (choice.equals("give up")) {
            System.out.println("You give up and are swept downstream. Game over.");
        } else { //Ends program if an invalid answer is submitted
            System.out.println("Invalid choice. Game over.");
        }
    }

    private static void walkAlongBank(Scanner scanner) {
        System.out.println("While walking along the bank, you find a boat. Do you want to take the boat or keep walking?");
        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("take the boat")) {
            System.out.println("You row the boat to safety! You win!");
        } else if (choice.equals("keep walking")) {
            System.out.println("You walk until you are too tired to go on. Game over.");
        } else {//Ends program if an invalid answer is submitted
            System.out.println("Invalid choice. Game over.");
        }
    }

    private static void enterCave(Scanner scanner) {
        System.out.println("Inside the cave, you find a treasure chest. Do you want to open it or leave it?");
        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("open it")) {
            System.out.println("The chest is filled with gold! You win!");
        } else if (choice.equals("leave it")) {
            System.out.println("You leave the cave and find a beautiful meadow. You win!");
        } else {//Ends program if an invalid answer is submitted
            System.out.println("Invalid choice. Game over.");
        }
    }

    private static void continueWalking(Scanner scanner) {
        System.out.println("As you walk further, you see a friendly traveler. Do you want to talk to them or ignore them?");
        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("talk to them")) {
            System.out.println("The traveler shares stories of adventure. You make a new friend! You win!");
        } else if (choice.equals("ignore them")) {
            System.out.println("You wander alone and get lost. Game over.");
        } else {//Ends program if an invalid answer is submitted
            System.out.println("Invalid choice. Game over.");
        }
    }
}
