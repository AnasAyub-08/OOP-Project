package arcade;

import games.*;

import java.util.Scanner;

public class Arcade {

    private Player player;
    private Scanner scanner;

    public Arcade(Player player) {
        this.player = player;
        scanner = new Scanner(System.in);
    }

    public void start() {
        int choice;

        do {
            showMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    playGame(new RockPaperScissors());
                    break;
                // case 2:
                //     playGame(new NumberGuessGame());
                //     break;
                // case 3:
                //     playGame(new QuizGame());
                //     break;
                case 4:
                    player.showScores();
                    break;
                case 5:
                    System.out.println("Thanks for playing!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }

    private void showMenu() {
        System.out.println("\n=== Command Line Arcade ===");
        System.out.println("1. Rock Paper Scissors");
        System.out.println("2. Number Guessing Game");
        System.out.println("3. Quiz Game");
        System.out.println("4. View Scores");
        System.out.println("5. Quit");
        System.out.print("Choose an option (1/2/3/4/5): ");
    }

    private void playGame(Game game) {
        game.play();
        player.setScore(game.getGameName(), game.getScore());
    }
}
