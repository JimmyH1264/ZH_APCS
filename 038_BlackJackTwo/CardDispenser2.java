import java.util.Scanner;
public class CardDispenser2 {
    int userV;
    public void draw() {
        userV += ((int)(Math.random()*10+1) + (int)(Math.random()*10+1));
        System.out.println("you draw cards that has a value of " + userV);
    }
    public void hit() {
        int hon;
        Scanner scan = new Scanner(System.in);
        System.out.println("would you like to hit?");
        hon = scan.nextInt();
        while (userV < 21) {
        if (hon == 1){
            this.userV = userV + (int)(Math.random()*10+1);
            System.out.println("You have a value of " + userV);
            if (userV == 21){
                System.out.println("you won");
                break;
            }
            else if (userV > 21){
                System.out.println("you busted");
                break;
            }
            else{
                hit();
            }
        }else{
            System.out.println("you decided not to hit");
            int compV = ((int)(Math.random()*10+1) + (int)(Math.random()*10+1));
            System.out.println("computer has a value of " + compV);
            if (userV >= compV){
                System.out.println("you won");
                break;
            }else{
                System.out.println("you lost");
                break;
            }
        }
        break;
    }
}


    public static void main(String[] args) {
        CardDispenser2 cd = new CardDispenser2();
        cd.draw();
        cd.hit();
    }
}