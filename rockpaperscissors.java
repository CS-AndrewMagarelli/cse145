//Andrew Magarelli
package Homework;

import java.util.Random;
import java.util.Scanner;

public class rockpaperscissors {
    
    // Constants for the choices
    private static final String[] CHOICES = {"rock", "paper", "scissors"};
    private static final int ROUNDS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;

        do {
            int playerScore = 0;
            int computerScore = 0;

            for (int round = 1; round <= ROUNDS; round++) {
                System.out.println("Round " + round + ": Enter rock, paper, or scissors:");
                String playerChoice = scanner.nextLine().toLowerCase();

                // Validate user input
                if (!isValidChoice(playerChoice)) {
                    System.out.println("Invalid choice! Computer gets a point.");
                    computerScore++;
                    continue; // Skip to the next round
                }

                // Computer makes a random choice
                int computerChoiceIndex = random.nextInt(CHOICES.length);
                String computerChoice = CHOICES[computerChoiceIndex];

                System.out.println("Computer chose: " + computerChoice);
                int roundResult = determineRoundWinner(playerChoice, computerChoice);

                if (roundResult == 1) {
                    System.out.println("You win this round!");
                    playerScore++;
                } else if (roundResult == -1) {
                    System.out.println("Computer wins this round!");
                    computerScore++;
                } else {
                    System.out.println("It's a draw!");
                }
            }

            // Declare overall winner
            declareWinner(playerScore, computerScore);

            // Ask if the player wants to play again
            System.out.println("Do you want to play again? (yes/no)");
            playAgain = scanner.nextLine().equalsIgnoreCase("yes");
        } while (playAgain);

        System.out.println("Thank you for playing!");
        scanner.close();
    }

    // Validate the player's choice
    private static boolean isValidChoice(String choice) {
        for (String validChoice : CHOICES) {
            if (validChoice.equals(choice)) {
                return true;
            }
        }
        return false;
    }

    // Determine the winner of the round
    private static int determineRoundWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return 0; // Draw
        } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return 1; // Player wins
        } else {
            return -1; // Computer wins
        }
    }

    // Declare the overall winner
    private static void declareWinner(int playerScore, int computerScore) {
        System.out.println("Final Scores: You - " + playerScore + ", Computer - " + computerScore);
        if (playerScore > computerScore) {
            System.out.println("You are the overall winner!");
        } else if (computerScore > playerScore) {
            System.out.println("Computer is the overall winner!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}