

public class AIOponent {


    public static String computerChoice;

    public static void generateChoice(){
        int random = (int) (Math.random()*3);
        if(random ==1){
            computerChoice="rock";
        }
        if(random == 2){
            computerChoice="scissors";
        }
        if(random ==3){
            computerChoice="paper";
        }
    }

    public static void respondToPlayer(String s){
        if(s == computerChoice){
            System.out.println("Computer choice: " +
                    ""+computerChoice+". Player choice: "+ s+"= draw");
            Main.canChoose = true;
        }else{


            if(s == "scissors" && computerChoice == "rock"){
                System.out.println("Computer choice: " +
                        ""+computerChoice+". Player choice: "+ s+"= you lose");
                Main.canChoose = true;
            }

            if(s == "rock" && computerChoice == "paper"){
                System.out.println("Computer choice: " +
                        ""+computerChoice+". Player choice: "+ s+"= you lose!");
                Main.canChoose = true;
            }

            if(s == "paper" && computerChoice == "scissors"){
                System.out.println("Computer choice: " +
                        ""+computerChoice+". Player choice: "+ s+"= you lose!");
                Main.canChoose = true;
            }



            if(s == "rock" && computerChoice == "scissors"){
                System.out.println("Computer choice: " +
                        ""+computerChoice+". Player choice: "+ s+"= you win");
                Main.canChoose = true;
            }

            if(s == "paper" && computerChoice == "rock"){
                System.out.println("Computer choice: " +
                        ""+computerChoice+". Player choice: "+ s+"= you win!");
                Main.canChoose = true;
            }

            if(s == "scissors" && computerChoice == "paper"){
                System.out.println("Computer choice: " +
                        ""+computerChoice+". Player choice: "+ s+"= you win!");
                Main.canChoose = true;
            }

        }

    }


}
