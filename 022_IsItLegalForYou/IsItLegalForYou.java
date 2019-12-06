import java.util.Scanner;
public class IsItLegalForYou {
    public static void main(String[] args) {
        int age;
        Scanner scan = new Scanner(System.in);
        //make a scanner object
        System.out.print("Enter your age: ");
        age = scan.nextInt();
        //returns an integer
        if (age >= 16){
            System.out.println("You can get a driver's license but be careful!");
            // 16 years old category
            if (age >= 18){
                //if 16 then check if 18
            System.out.println("You can buy cigarettes but don't smoke in public!");
            System.out.println("You can go to a casino but don't waste money!");
            //18 category
                if ( age >= 21){
                    //check if 18 then check if 21
                System.out.println("You can buy alcohol and drink but not while driving!");
                System.out.println("You can rent a car but don't get in a crash!");
                //21 categories
                }else{
                    //if you are under 21 but over 18 print out warning
                    System.out.println("Don't rent a car");
                    System.out.println("Don't buy alcohol");
                    //18-20 category
                }
            }else{
                //if you are over 16 but under 18
                System.out.println("Dont smoke cigarettes");
                System.out.println("Don't go to a casino");
                System.out.println("Don't rent a car");
                System.out.println("Don't buy alcohol");
                //16-17 categories
            }
        }else{
            System.out.println("Go home and study.");
            //if you are less than 16
        }

    }
}