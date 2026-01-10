package games;

public abstract class Game {

    protected String gameName;
    protected int score;

    public Game(String gameName) {
        this.gameName = gameName;
        this.score = 0;
    }

    public String getGameName() {
        return gameName;
    }

    public int getScore() {
        return score;
    }

    public abstract void play();
}
