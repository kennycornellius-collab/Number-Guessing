public class Stats {
    protected String name;
    protected int win;
    protected int lose;
    protected int highestGuess = 0;
    protected int lowestGuess = Integer.MAX_VALUE;
    protected double averageGuess;
    protected int totalRounds;
    protected int totalGuess;
    public Stats(String name){
        this.name = name;
    }
    public int winIncrease(){
        return win++;
    }
    public void totalGuessIncrease(){
        totalGuess++;
    }
    public void totalRoundsIncrease(int roundsIncrease){
        totalRounds = roundsIncrease;
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
    public double averageGuessCalc(){
        if (win == 0){return 0;}
        return ((totalGuess)*1.0)/win;
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
