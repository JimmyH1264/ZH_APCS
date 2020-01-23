import java.text.*;
import java.util.Scanner;
//import the text stuff and the scanner stuff
public class AbecedarianWords {
    public static void main(String[] args) {
        String abece;
        int abeceOrNot = 0;
        //this is like a boolean
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        abece = scan.next();
        int length = abece.length();
        //catching lengths
        for (int i = 0; i < length-1; i++){
            // this is for catching how many letters it has, how many for loop it will run thru
            String letter2 = abece.substring(i,i+1);
            String letter = (abece.substring(i+1,i+2));
            //catching the letter and the one after it
            if (letter2.compareToIgnoreCase(letter) < 0 ){
                // this gives you signs, for exp b compare to a is negative
                abeceOrNot += 1;
                // if checker is positive in total therefore it is abecedarian
            }else{
                abeceOrNot -= 100;
                //if its not it minors 100 so it will never be positive again
            }
        }
        if (abeceOrNot > 0 ){
            System.out.println("it is abece");
        }else{
            System.out.println("it is not");
        }
        //tell you if it is abece or not
        scan.close();
    }
}