public class Player {
    protected String name;
    protected int guessCount;
    public Player(String name) {
        this.name = name;
        this.guessCount = 0;
    }
    public String getName() {
        return name;
    }
    public int getGuessCount() {
        return guessCount;
    }
    public void increaseGuess() {
        guessCount++;
    }
    public void clearCount() {
        guessCount = 0;
    }
    public int enterGuess() {
        return 0;
    }
}