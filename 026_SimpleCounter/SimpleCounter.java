import java.util.Scanner;
//import scanner
public class SimpleCounter {
    public static void main(String[] args) {
        int num0 = 0;
        //this is the starting number which is zero
        int num;
        //this is the number that the user inputs 
        Scanner scan = new Scanner(System.in);
        System.out.println("what number do you want to count to?");
        //asking statement
        num = scan.nextInt();
        //this integer is the input number
        while (num0 < num) {
            //while () {}
            num0++;
            //this is zero but keeps adding 1
            System.out.print(num0 + " ");
            //this prints out the number everytime util num0 is equal to num
        }

    }
}