import java.util.Scanner;
//import scanner

public class LoanCalculator
{
    public static void main(String[] args){
        double pB;
        double aR;
        int rM;
        //these declare variable
        Scanner scan = new Scanner(System.in);
        //make a scanner class
        System.out.println("Enter your principal balance:");
        pB = scan.nextDouble();
        //this makes the variable equals to the value you typed
        System.out.println("Your monthly interest is " + pB + "$");
        //just checking
        System.out.println("Enter your annual interests:");
        aR = scan.nextDouble();
        //this makes the variable equals to the value you typed
        System.out.println("Enter your remaining months:");
        rM = scan.nextInt();
        //this makes the variable equals to the value you typed
        double mI = pB * (aR/rM);
        //this i found in the assignment
        System.out.println("your monthly interest is " + mI + "$");
        //print out the statemen saying the monthly interest
        double mP = (pB / rM) + mI;
        //this i found in the assignment
        System.out.println("Your monthly payment is " + mP + "$");
        //this prints out the monthly payment
        scan.close();
        //you probably need this for the scannerthing.im not quite sure what it means



    }
}