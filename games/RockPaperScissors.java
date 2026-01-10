package games;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors extends Game {

    public RockPaperScissors() {
        super("Rock Paper Scissors");
    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        System.out.print("Enter rock, paper or scissors: ");
        String playerChoice = scanner.nextLine().toLowerCase();

        String computerChoice = choices[random.nextInt(3)];

        System.out.println("Computer chose: " + computerChoice);

        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
            score = 1;
        } else if (
                (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            System.out.println("You win!");
            score = 3;
        } else {
            System.out.println("You lose!");
            score = 0;
        }
        scanner.close();
    }
}
