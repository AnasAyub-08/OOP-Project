import arcade.Arcade;
import arcade.Player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        Player player = new Player(name);
        Arcade arcade = new Arcade(player);

        arcade.start();
        scanner.close();
    }
}
