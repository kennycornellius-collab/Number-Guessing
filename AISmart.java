public class AISmart extends Player{
    protected int high;
    protected int low;
    protected int prevGuess;
    protected boolean firstTime = true;
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
}
