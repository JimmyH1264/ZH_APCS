import java.time.temporal.ValueRange;
import java.util.Random;
import java.util.Scanner;
public class VeryAccurateCaseOpening
{
    public static void main(String[] args){

        ValueRange range = ValueRange.of(475,495);

        Scanner scan = new Scanner(System.in);
        double spend;
        double profit;

        System.out.println("How many times do you want to open cases :");
        int times = scan.nextInt();
        int cases = 0;

        while (cases <= times) {
            int num = (int)(Math.random() * 500);
            int num1 = (int)(Math.random()* 10);

        if( num == 101 ){
            if(num1 < 2){
                System.out.println("!!!! StatTrak™ Knife !!!!");
            }else{
                System.out.println(" K K K K K K K K Knife ");
                System.out.println("It costs you " + (cases) + " cases to get a knife.");
                double money = 2.66 * (cases);
                System.out.println("It costs you "+ money + " $ to get a knife.");
                cases += 9999;
            }
        }else if (num < 101){
            if(num1 < 2){
                System.out.println("StatTrak™ Restriced");
            }else{
                System.out.println(" Restriced");
                cases += 1;
            }
        }else if ( range.isValidIntValue(num)){
            if(num1 < 2){
                System.out.println("StatTrak™ Classified");
            }else{
                System.out.println(" Classified ");
                cases += 1;
            }
    }   else if (num > 496){
        if(num1 < 2){
            System.out.println( num + "StatTrak™ Convert !!!!");
        }else{
            System.out.println( num + " Convert");
            cases += 1;
        }
}       else {
    if(num1 < 2){
        System.out.println("StatTrak™ Mil-Spec");
    }else{
        System.out.println(" Mil-Spec");
        cases += 1;
    }
}
        }        
        if (cases < 1000) {
            System.out.println("You opened " + (cases-1) + " cases and got nothing. ");
            System.out.println("Cost :"  + (cases-1)*2.66 + "$");
        }else{
            
            System.out.println("If you get a knife congrats if not Sucks for you lol");
        }

    } 
}

