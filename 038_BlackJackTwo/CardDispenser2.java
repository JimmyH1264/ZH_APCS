import java.util.Scanner;
public class CardDispenser2 {
    int userV;
    public void draw() {
        userV += ((int)(Math.random()*10+1) + (int)(Math.random()*10+1));
        System.out.println("you draw cards that has a value of " + userV);
        //this gives you the original value
    }
    public void hit() {
        //hit method
        int hon;
        Scanner scan = new Scanner(System.in);
        System.out.println("would you like to hit?1 for yes other int for no");
        hon = scan.nextInt();
        while (userV < 21) {
            // if you are less than 21 ur fine
        if (hon == 1){
            //if you say 1 you are going to hit
            this.userV = userV + (int)(Math.random()*10+1);
            System.out.println("You have a value of " + userV);
            if (userV == 21){
                System.out.println("you won");
                break;
                // ifyou got 21 you won
            }
            else if (userV > 21){
                System.out.println("you busted");
                break;
                // if you got over 21 you are done, break is for it to break the loop
            }
            else{
                hit();
                //so if its still less than 21 it will ask you again
            }
        }else{
            System.out.println("you decided not to hit");
            int compV = ((int)(Math.random()*10+1) + (int)(Math.random()*10+1));
            System.out.println("computer has a value of " + compV);
            
            //this is not what actual black jack suppose to be
            while (compV < 17){
                System.out.println("computer hits");
                compV += (int)(Math.random()*10+1);
                System.out.println("computer drew a card and currently has a value of " + compV);
            }
            if (compV > 21) {
                System.out.println("computer busted . ");
            }else{
                if (userV > compV){
                    System.out.println("computer has a value of " + compV + " in the end");
                    System.out.println("you have a value of " + userV + " in the end");
                    System.out.println("you won . ");
                    break;
                }
                else{
                    System.out.println("computer has a value of " + compV + " in the end");
                    System.out.println("you have a value of " + userV + " in the end");
                    System.out.println("computer won .");
                    break;
                }
            }
            }
            scan.close();
        break;
        }

        
    }
}