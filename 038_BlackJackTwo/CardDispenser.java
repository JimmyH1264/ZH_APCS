import java.util.Scanner;
public class CardDispenser {
    static int fCard;
    static int sCard;
    static int dfCard;
    static int dsCard;
    static int userV;
    static int dealerV;
    static int anotherCard;
    static String checker;
    static boolean hit;
    public static int pDraw() {
        System.out.println("Welcome to blackjack2, its your turn to draw cards.");
        fCard = (int)(Math.random()*10+1);
        sCard = (int)(Math.random()*10+1);
        System.out.println("your first card is " + fCard +", your second card is " + sCard);
        userV = fCard + sCard;
        dDraw();
        return userV;
    }
    public static int dDraw() {
        dfCard = (int)(Math.random()*10+1);
        dsCard = (int)(Math.random()*10+1);
        dealerV = dfCard + dsCard;
        System.out.println("dealers has a card of " + dfCard);
        HOR();
        return dealerV;
    }
    public static void hit() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hit or Not?");
        checker = scan.next();
    }
    public static boolean HOR() {
        hit();
        if (checker.contains("hit")) {
            hit = true;
            anotherCard = (int)(Math.random()*10+1);
            userV += anotherCard;
            System.out.println("You drew the card that has a value of " + anotherCard);
            System.out.println("Your total value now is " + userV);
            if (userV > 21) {
                System.out.println("you busted");
                break;
            }else if (userV == 21){
                System.out.println("You won");
            }else{
                System.out.println("Your total value now is " + userV + ". Would you like to draw another card ? ");
                HOR();
                if (userV > dealerV){
                    System.out.println("You won");
                }else{
                    System.out.println("You lost");
                }
            }
            return hit;
        }else{
            System.out.println("Dealer has a total value of " + dealerV);
                if (userV > dealerV){
                    System.out.println("You won");
                }else{
                    System.out.println("You lost");
                }
            hit = false;
            return hit;
        }
        
    }


    public static void main(String[] args) {
        CardDispenser cd = new CardDispenser();
        cd.pDraw();
    }
}