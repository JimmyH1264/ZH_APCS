import java.util.Scanner;
//import scanner
public class SpellingBeeSimulator {
    public static void main(String[] args) {
        String bee;
        //this is the string for input
        Scanner scan = new Scanner(System.in);
        //make an object scanner           
        System.out.println("hey wanna say a word for me ?:");
        //input lines
        bee = scan.nextLine();
        //this carries the variable
        int num = bee.length()-1;
        //this is needed for the spelling
        System.out.println(num);
        //checking the num variable
        for (int i = 0; i <= num; i++){
            // this variable 'i' is meant to break down the letters            
            if (i != num ){
                //when i equals num, it means that the i reach the last letter of the word
                System.out.print(bee.substring(i,i+1) + "-");
                //before that so it needs a dash after that
        }
            else{
                System.out.print(bee.substring(i));
                System.out.println(" ");
                //else it doesnt need the dash behind it
            }
        }
        scan.close();


    }
}