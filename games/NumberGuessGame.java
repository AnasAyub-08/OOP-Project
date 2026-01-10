package games;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame extends Game {

    public NumberGuessGame() {
        super("Number Guessing Game");
    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int target = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("\nGuess the number between 1 and 100!");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > target) {
                System.out.println("Too high!");
            } else if (guess < target) {
                System.out.println("Too low!");
            }

        } while (guess != target);

        System.out.println("Correct! You guessed it in " + attempts + " attempts.");

        if (attempts <= 5) {
            score = 5;
        } else if (attempts <= 10) {
            score = 3;
        } else {
            score = 1;
        }
    }
}
