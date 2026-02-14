import java.util.Random;
import java.util.ArrayList;
import java.util.List;
public class AIDumb extends Player{
    Random rand = new Random();
    List<Integer> checkednum = new ArrayList<>();
    public AIDumb(String name){
        super(name);
    }
    public int enterGuess(int top, int bottom) {
        while(true){
            int guess = rand.nextInt(top-bottom+1)+bottom;
            if (!checkednum.contains(guess)){
                checkednum.add(guess);
                return guess;
            }
        }
    }
    public void clearGuess(){
        checkednum.clear();
    }
}
