import java.util.Scanner;

public class Game {
    Scanner scannerOut = new Scanner(System.in);
    Player p1;
    Player p2;
    int p1Bottom, p1Top;
    int p2Bottom, p2Top;
    int AInumberToGuess;
    public Game(int mode) {
        if (mode == 1){
            p1 = new HumanPlayer("P1", scannerOut);
            p2 = new HumanPlayer("P2", scannerOut);
        }
        else if (mode == 2){
            p1 = new HumanPlayer("P1", scannerOut);
            p2 = new AIDumb("AI1");
        }
        else if (mode == 3){
            p1 = new HumanPlayer("P1", scannerOut);
            p2 = new AISmart("AI1");
        }
        
    }

    public void round() {
        int i = 1;
        while (true) {
            System.out.println("Starting round: " + i);
            int P1Guess = p1.enterGuess(p1Top, p1Bottom);
            int P2Guess = p2.enterGuess(p2Top, p2Bottom);
            System.out.println("=======================================");
            System.out.println("P1 guess: " + P1Guess);
            System.out.println("P2 guess: " + P2Guess);

            System.out.println("P1 - is P2's guess correct? (y/n)");
            scannerOut.nextLine();
            String correction = scannerOut.nextLine();
            if (correction.equalsIgnoreCase("y")) {
                p2.increaseGuess();
                System.out.println("P2 won with " + p2.getGuessCount() + " guesses!");
                break;
            } else {
                p2.increaseGuess();
            }

            System.out.println("P2 - is P1's guess correct? (y/n)");
            correction = scannerOut.nextLine();
            if (correction.equalsIgnoreCase("y")) {
                p1.increaseGuess();
                System.out.println("P1 won with " + p1.getGuessCount() + " guesses!");
                break;
            } else {
                p1.increaseGuess();
            }

            i++;
        }
    }
    public void range() {
        System.out.println("P1 set your range:");
        System.out.println("Highest:");
        p1Top = scannerOut.nextInt();
        System.out.println("Lowest:");
        p1Bottom = scannerOut.nextInt();

        System.out.println("P2 set your range:");
        System.out.println("Highest:");
        p2Top = scannerOut.nextInt();
        System.out.println("Lowest:");
        p2Bottom = scannerOut.nextInt();
    }
    public void AIvsHuman(){
        System.out.println("P1 set your range:");
        System.out.println("Highest:");
        p1Top = scannerOut.nextInt();
        System.out.println("Lowest:");
        p1Bottom = scannerOut.nextInt();
        AInumberToGuess = p2.AInumber(p1Top, p1Bottom);
    }
    public void AIRound(){
        int i = 1;
        while (true) {
            System.out.println("Starting round: " + i);
            int P2Guess = p2.enterGuess(p1Top, p1Bottom);
            System.out.println("=======================================");
            System.out.println("P2 guess: " + P2Guess);
            System.out.println("P1 - is P2's guess correct? (y/n)");
            String correction = scannerOut.next();
            if (correction.equalsIgnoreCase("y")) {
                p2.increaseGuess();
                System.out.println("P2 won with " + p2.getGuessCount() + " guesses!");
                p2.clearGuess();
                break;
            } 
            else {
                p2.increaseGuess();
            }
            System.out.println("P1 enter your guess: ");
            int P1Guess = scannerOut.nextInt();
            if (P1Guess == AInumberToGuess){
                p1.increaseGuess();
                System.out.println("P1 won with " + p1.getGuessCount() + " guesses!");
                break;
            }
            else{
                p1.increaseGuess();
            }
            i++;
        }
    }
    public void AIRoundSmart(){
        int i = 1;
        while (true) {
            System.out.println("Starting round: " + i);
            int P2Guess = p2.enterGuess(p1Top, p1Bottom);
            System.out.println("=======================================");
            System.out.println("P2 guess: " + P2Guess);
            System.out.println("P1 - is P2's guess correct? (y/n)");
            String correction = scannerOut.next();
            if (correction.equalsIgnoreCase("y")) {
                p2.increaseGuess();
                System.out.println("P2 won with " + p2.getGuessCount() + " guesses!");
                p2.clearGuess();
                break;
            } 
            else {
                p2.increaseGuess();
                System.out.println("Is your number higher(H) or lower(L)?");
                String choose = scannerOut.next();
                if (choose.equalsIgnoreCase("H")){
                    p2.tooLow();
                }
                else if (choose.equalsIgnoreCase("L")){
                    p2.tooHigh();
                }
            }
            System.out.println("P1 enter your guess: ");
            int P1Guess = scannerOut.nextInt();
            if (P1Guess == AInumberToGuess){
                p1.increaseGuess();
                System.out.println("P1 won with " + p1.getGuessCount() + " guesses!");
                break;
            }
            else{
                p1.increaseGuess();
            }
            i++;
        }
    }
    public static void main(String[] args) {
        Game game = new Game(0);
        System.out.println("Number Guessing Game");
        System.out.println("Enter the mode you want:");
        System.out.println("Human Vs Human (1)");
        System.out.println("Human Vs AI Dumb (2)");
        System.out.println("Human Vs AI Smart (3)");
        int mode = game.scannerOut.nextInt();
        game = new Game(mode);
        if (mode == 1){
            game.range();
            game.round();
        }
        else if (mode == 2){
            game.AIvsHuman();
            game.AIRound();
        }
        else if (mode == 3){
            game.AIvsHuman();
            game.AIRoundSmart();
        }
        
        
    }
}