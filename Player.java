import java.util.ArrayList;
import java.util.List;
public class Player {
    protected String name;
    protected int guessCount;
    protected List<Integer> checkednum = new ArrayList<>();
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
    public int enterGuess(int top, int bottom) {
        return 0;
    }
    public void clearGuess(){
        checkednum.clear();
    }
    public void tooLow(){
    }
    public void tooHigh(){
    }
}