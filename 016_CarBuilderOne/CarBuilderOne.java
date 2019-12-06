import java.util.Scanner;
//import scanner here

public class CarBuilderOne {
    public static void main(String[] args) 
    {
        int yeear;
        int miles;
        String brand;
        String type;
        Boolean turbo;
        //these declare the variable first
        Scanner scan = new Scanner(System.in);
        //make a scanner class
        System.out.println("Enter your brand:");
        brand = scan.nextLine();
        //this makes the variable equal to the thing you typed
        System.out.println("Enter your type:");
        type = scan.nextLine();
        //this makes the variable equal to the thing you typed
        System.out.println("Enter your year:");
        yeear = scan.nextInt();
        //this makes the variable equal to the thing you typed
        System.out.println("Enter your miles driven:");
        miles = scan.nextInt();
        //this makes the variable equal to the thing you typed
        System.out.println("Do you have turbo (true or false):");
        turbo = scan.nextBoolean();
        //this makes the variable equal to the thing you typed
        Car scar = new Car(yeear,miles,brand,type,turbo);
        //build a car with those paramters which i entered before
        System.out.println("year :" + yeear);
        System.out.println("miles driven :" + miles);
        System.out.println("brand :" + brand);
        System.out.println("type :" + type);
        System.out.println("has turbo or not :" + turbo);
        //print our those features of the car
        scan.close();
        //close the function

    }
}