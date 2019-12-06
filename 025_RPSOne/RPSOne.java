import java.util.Scanner;
//import scanner
public class RPSOne{
    public static void main(String[] args) {
        int Computer = (int)(Math.random()* 3 + 1);
        //this is computer's rps, generates 1 2 3
        String aiRPS;
        //string show what computer has
        String rpsUser;
        //this is the input thing
        Scanner scan = new Scanner(System.in);
        System.out.println("Type rock or 1 for rock; paper or 2 for paper; scissor or 3 for scissor : ");
        rpsUser = scan.nextLine();
        //returns value of you enter
        if (Computer == 3){
            aiRPS = "Scissor";
        }else if (Computer == 2) {
            aiRPS = "Paper";
        }else{
            aiRPS = "Rock";
        }
        // computer statement, if computer =1 it returns scissor
        System.out.println("Computer had " + aiRPS);
        //print out statement
        if (rpsUser.equals("1") || rpsUser.equals("rock") || rpsUser.equals("Rock")){
            // if or or or means if there is at least ont is true, it is going to process in this one
            System.out.println("You had rock");
            //print what you had
            if (aiRPS.equals("Scissor")){
                // if computer is scissor you win
                System.out.println("you win");
            }else if (aiRPS.equals("Rock")){
                System.out.println("Draw");
                // if computer is rock no one lose or win
            }else{
                System.out.println("You lost");
                // if computer is paper you lost
            }

        }else if (rpsUser.equals("2") || rpsUser.equals("paper") || rpsUser.equals("Paper")) {
            System.out.println("You had paper");
            if (aiRPS.equals("Rock")){
                System.out.println("you win");
            }else if (aiRPS.equals("Paper")){
                System.out.println("Draw");
            }else{
                System.out.println("You lost");
            }

        }else if (rpsUser.equals("3") || rpsUser.equals("scissor") || rpsUser.equals("Scissor")) {
            System.out.println("You had rock");
            if (aiRPS.equals("Paper")){
                System.out.println("you win");
            }else if (aiRPS.equals("Scissor")){
                System.out.println("Draw");
            }else{
                System.out.println("You lost");
            }

        }else{
            System.out.println("You must typed something wrong.");
            //just a print out statement saying you typed wrong, but i dont know how do you retype it 
        }

    }
}