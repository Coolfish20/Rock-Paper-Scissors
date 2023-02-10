
import java.util.Scanner;

public class Main {

    public static boolean canChoose;

    public static String playersChose;

    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper and scissors!");
        canChoose=true;

        while(true) {
            if(canChoose == true) {
                Scanner s = new Scanner(System.in);
                System.out.println("Choose r, p or s: ");
                String c = s.next();
                s.nextLine();

                if (c.equals("r") || c.equals("p") || c.equals("s")) {
                    if (c.equals("r")) {
                        playersChose = "rock";
                        AIOponent.generateChoice();
                        AIOponent.respondToPlayer(playersChose);
                    }
                    if (c.equals("p")) {
                        playersChose = "paper";
                        AIOponent.generateChoice();
                        AIOponent.respondToPlayer(playersChose);
                    }
                    if (c.equals("s")) {
                        playersChose = "scissors";
                        AIOponent.generateChoice();
                        AIOponent.respondToPlayer(playersChose);
                    }


                }else {
                    System.out.println("Invalid Input.");
                    continue;
                }
            }
        }

    }
}
