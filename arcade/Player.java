package arcade;

import java.util.HashMap;

public class Player {

    private String name;
    private HashMap<String, Integer> scores;

    public Player(String name) {
        this.name = name;
        scores = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setScore(String gameName, int score) {
        scores.put(gameName, score);
    }

    public void showScores() {
        System.out.println("\n=== Scoreboard ===");
        if (scores.isEmpty()) {
            System.out.println("No games played yet.");
            return;
        }

        for (String game : scores.keySet()) {
            System.out.println(game + ": " + scores.get(game));
        }
    }
}
