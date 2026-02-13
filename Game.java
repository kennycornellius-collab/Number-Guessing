import java.util.Scanner;

public class Game {
    Scanner scannerOut = new Scanner(System.in);
    Player p1;
    Player p2;
    int p1Bottom, p1Top;
    int p2Bottom, p2Top;

    public Game() {
        p1 = new HumanPlayer("P1", scannerOut);
        p2 = new HumanPlayer("P2", scannerOut);
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
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("Number Guessing Game");
        System.out.println("Enter the mode you want:");
        System.out.println("Human Vs Human (1)");
        System.out.println("AI Vs AI (2)");
        int choice = game.scannerOut.nextInt();
        if (choice == 1) {
            System.out.println("Mode: Human Vs Human");
            game.range();
            game.round();
        }
    }
}