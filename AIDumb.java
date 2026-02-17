import java.util.Random;
public class AIDumb extends Player{
    Random rand = new Random();
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
    public int AInumber(int AItop, int AIbottom){
        return rand.nextInt(AItop-AIbottom+1)+AIbottom;
    }
}
