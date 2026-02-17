import java.util.Random;
public class AISmart extends Player{
    protected int high;
    protected int low;
    protected int prevGuess;
    protected boolean firstTime = true;
    Random rand = new Random();
    public AISmart(String name){
        super(name);
    }
    public int enterGuess(int top, int bottom){
        if (firstTime){
            high = top;
            low = bottom;
            firstTime = false;
        }
        prevGuess = (high+low)/2;
        return prevGuess;
    }
    public void tooHigh(){
        high = prevGuess-1;
    }
    public void tooLow(){
        low = prevGuess+1;
    }
    public int AInumber(int AItop, int AIbottom){
        return rand.nextInt(AItop-AIbottom+1)+AIbottom;
    }
}
