public class Stats {
    protected String name;
    protected int win;
    protected int lose;
    protected int highestGuess = -1000;
    protected int lowestGuess = 10000;
    protected int averageGuess;
    
    public Stats(String name){
        this.name = name;
    }
    public int winIncrease(){
        return win++;
    }
    public int loseIncrease(){
        return lose++;
    }
    public void highestGuessChange(int guessCount){
        if (guessCount > highestGuess){
            highestGuess = guessCount;
        }
    }
    public void lowestGuessChange(int guessCount){
        if (guessCount < lowestGuess){
            lowestGuess = guessCount;
        }
    }
    public int averageGuessCalc(){
        return (lowestGuess+highestGuess)/2;
    }
    public void showStats(){
        averageGuess = averageGuessCalc();
        System.out.println("Average Guess for "+name+": "+averageGuess);
        System.out.println("Highest Guess for "+name+": "+highestGuess);
        System.out.println("Lowest Guess for "+name+": "+lowestGuess);
        System.out.println("Win count for "+name+": "+win);
        System.out.println("Lose count for "+name+": "+lose);
    }
}
