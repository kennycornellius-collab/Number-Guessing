import java.util.Scanner;
public class HumanPlayer extends Player {
    Scanner scanner;
    public HumanPlayer(String name, Scanner scanner) {
        super(name);
        this.scanner = scanner;
    }
    public int enterGuess(int top, int bottom) {
        System.out.println("Enter your guess:");
        return scanner.nextInt();
    }
}