import java.util.Scanner;
//import scanner
public class BlackJackOne {
    public static void main(String[] args) {
       int fC = (int)(Math.random()*11+1);
       int sC = (int)(Math.random()*11+1);
       //first and second card for you 
       boolean hitOrNot;
       //true or false 
       int x;
       //this is a trigger for hitOrNot
       int cfC = (int)(Math.random()*11+1);
       int csC = (int)(Math.random()*11+1);
       //computer random number
       int cTotal = cfC + csC;
       //computer total of those random number
       System.out.println("Your first card is a " + fC);
        System.out.println("Your second card is a " + sC);
        //print out numbers for you so you know
        Scanner scan = new Scanner(System.in);
        //make a scanner object
        System.out.println("Hit or Stay ? (type an integer, 1 for hit, 0 for stay)");
        x = scan.nextInt();
        //returns an integer for x
        if ( x == 1 ){
            hitOrNot = true;
            //this became true
            int tC = (int)(Math.random()*11+1);
            // this is the third card
            int total = fC + sC + tC;
            //calculate your total number
            System.out.println("Your third card is " + tC);
            //print out third card
            System.out.println(total);
            //print out total
            if (total > 21){
                System.out.println("You busted ! ");
                //if u over 21 in blackjack you busted so you lost
            }else if (total == 21){
                System.out.println("You win ! ");
                //if your score is 21 you just win
            }else{
                System.out.println("You have " + total);
                // your total
                System.out.println("Computer has " + cTotal);
                // ai's total
                if (cTotal >= total){
                    System.out.println("You lost");
                    // if computer is bigger you lost
                }else {
                    System.out.println("You win !");
                    // if computer is smaller you win
                }
            }
        }else if ( x == 0 ){
            // you dont hit
            hitOrNot = false;
            // this makes it false
            int total = fC + sC;
            // make your total number
            System.out.println("You have" + total);
            System.out.println("Computer has " + cTotal);
            //print out total number for each
            if (cTotal >= total){
                System.out.println("You lost");
                //if computer is bigger or equal than you you lost
            }else {
                System.out.println("You win !");
                //if you are bigger you win
            }
        }        
    }
}