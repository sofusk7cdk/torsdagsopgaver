import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    private static int rnd_number;

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();
    }

    private static void makeAGuess() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your guess: ");

        if (in.hasNextInt()) {
            int userGuess = in.nextInt();

            if (userGuess < rnd_number) {
                System.out.println("Too low! Try again.");
                makeAGuess(); // Recursive call for another guess
            } else if (userGuess > rnd_number) {
                System.out.println("Too high! Try again.");
                makeAGuess(); 
            } else {
                System.out.println("Correct! The number was " + rnd_number);
            }
        } else {
            System.out.println("That's not a valid number. Please enter a number.");
            in.next(); 
            makeAGuess();         
	}
    }
}
