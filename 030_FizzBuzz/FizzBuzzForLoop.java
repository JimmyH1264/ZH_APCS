import java.util.Scanner;
//input scanner
public class FizzBuzzForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //make a scanner object
        int num;
        //declare variable num for the loop
        int start = 1;
        //i dont know what this is for 
        System.out.println("What number do you want to count to ?:");
        //input line
        num = scan.nextInt();
        //capture the variable
        for (int i = 1; i <= num; i++){
            //this means when the number of i is less than the number of the input
            if (i % 3 == 0 && i % 5 != 0){
                System.out.println("Fizz");
            }
            else if (i % 5 == 0 && i % 3 != 0){
                System.out.println("Buzz");

            }else if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}