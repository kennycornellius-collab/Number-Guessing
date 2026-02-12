import java.util.Scanner;
public class Game{
    int mode;
    protected int bottom;
    protected int top;
    Scanner scannerOut = new Scanner(System.in);
    public Game(){
    }
    public void round(){
        int i = 1;
        int P1Count = 0;
        int P2Count = 0;
        while (true) {
            System.out.println("Starting round:"+i);
            System.out.println("P1 Enter your guess:");
            int P1Guess = scannerOut.nextInt();
            System.out.println("P2 Enter your guess:");
            int P2Guess = scannerOut.nextInt();
            System.out.println("=======================================");  
            System.out.println("P1 guess: "+P1Guess);
            System.out.println("P2 guess: "+P2Guess);
            System.out.println("P1 is the number P2 guess correct? (y/n)");
            scannerOut.nextLine();
            String correction = scannerOut.nextLine();
            if (correction.equals("y")||correction.equals("Y")){
                P1Count++;
                System.out.println("P1 Won with "+P1Count+" amount of guess");
                break;
            }
            else if(correction.equals("n")||correction.equals("N")){
                P1Count++;
            }
            System.out.println("P2 is the number P1 guess correct? (y/n)");
            correction = scannerOut.nextLine();
            if (correction.equals("y")||correction.equals("Y")){
                P2Count++;
                System.out.println("P2 Won with "+P2Count+" amount of guess");
                break;
            }
            else if(correction.equals("n")||correction.equals("N")){
                P2Count++;
            }
            i++;
        }
    }
    public void range(){
        System.out.println("Enter the range of the number you want the other player to guess");
        System.out.println("Highest:");
        top = scannerOut.nextInt();
        System.out.println("Lowest:");
        bottom = scannerOut.nextInt();
    }
    public void printRange(){
        System.out.println("Highest: "+top);
        System.out.println("Lowest: "+bottom);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number Guessing Game");
        System.out.println("Enter the mode you want:");
        System.out.println("Human Vs Human(1)");
        System.out.println("Ai Vs Ai(2)");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            System.out.println("Mode: Human Vs Human");
            Game game = new Game();
            Game p1 = new Game();
            Game p2 = new Game();
            p1.range();
            p2.range();
            p1.printRange();
            p2.printRange();
            game.round();
        }
    }
}