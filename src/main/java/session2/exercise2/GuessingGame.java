package Session2.Exercise2;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {

            int secretNumber = (int) (Math.random() * 100) + 1;
            int guess;
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessedCorrectly = false;

            System.out.println("\n Number Guessing Game ");
            System.out.println("I have cho a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            while (attempts < maxAttempts) {

                System.out.print("\nEnter your guess: ");
                guess = input.nextInt();

                attempts++;

                if (guess > secretNumber) {
                    System.out.println("Too high!");
                } else if (guess < secretNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Correct!");
                    guessedCorrectly = true;
                    break;
                }

                System.out.println("Attempts remaining: "
                        + (maxAttempts - attempts));
            }
            if (guessedCorrectly) {

                String performance;

                if (attempts <= 3) {
                    performance = "Excellent!";
                } else if (attempts <= 5) {
                    performance = "Good!";
                } else if (attempts <= 8) {
                    performance = "Fair!";
                } else {
                    performance = "Close call!";
                }

                System.out.println("\nSolved in " + attempts
                        + " attempts — " + performance);

            } else {
                System.out.println("\nYou ran out of attempts.");
                System.out.println("The correct number was: "
                        + secretNumber);
            }
            System.out.print("\nWould you like to play again? (yes/no): ");
            playAgain = input.next();
        }

        System.out.println("Thanks for playing!");
        input.close();
    }
}