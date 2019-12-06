import java.util.Scanner;
public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int start = 1;
        System.out.println("What number do you want to count to ?:");
        num = scan.nextInt();
        
        while (start < num){
            start++;
            if (start % 3 == 0 && start % 5 != 0){
                System.out.println("Fizz");
            }
            else if (start % 5 == 0 && start % 3 != 0){
                System.out.println("Buzz");

            }else if (start % 5 == 0 && start % 3 == 0) {
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(start);
            }
            
        }

        
    }
}