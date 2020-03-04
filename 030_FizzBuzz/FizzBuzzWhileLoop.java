import java.util.Scanner;
//import scanner
public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int start = 1;
        // starts 
        System.out.println("What number do you want to count to ?:");
        num = scan.nextInt();
        //catching the integer
        while (start < num){
            start++;
            if (start % 3 == 0 && start % 5 != 0){
                System.out.println("Fizz");
            }
            //floor divide 3 equal 0 but not 5 is fizz
            else if (start % 5 == 0 && start % 3 != 0){
                System.out.println("Buzz");

            }
            //floor divide 5 is equal 0 but not three is buzz
            else if (start % 5 == 0 && start % 3 == 0) {
                System.out.println("FizzBuzz");
            }
            //if there is no remainder when divide by 3 and 5 will print fizbuz
            else {
                System.out.println(start);
                //otherwise it will print number
            }
            
        }
        scan.close();

        
    }
}