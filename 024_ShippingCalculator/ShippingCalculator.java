import java.util.Scanner;
//always import scanner :)
public class ShippingCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //make a new object
        double weight;
        //declare weight object
        double price = 0;
        //some reason i have to make it 0
        System.out.println("How much does the thing weight");
        weight = scan.nextDouble();
        //returns the value of weight
        if(weight>0 && weight<= 1){
            price = 3.5;
            //if weight is bigger than 0 and less or equals than 1 returns 3.5 
        }else if(weight>1 && weight<= 3){
            price = 5.5;
            //if weight is bigger than 1 and less or equals than 3 returns 5.5
        }else if(weight>3 && weight<= 10){
            price = 8.5;
            //if weight is bigger than 3 and less or equals than 10 returns 8.5
        }else if(weight>10 && weight<= 20){
            price = 10.5;
            //if weight is bigger than 10 and less or equals than 20 returns 10.5 
        }else{
            System.out.println("Invalid! Too heavy!");
            //if the weight is over or less than 0 return invalide
        }
        if (weight <= 20){
            System.out.println("it costs " + price + "$");
        }else{
            System.out.println(" ");
        }
        //print out how much it costs

    }
}