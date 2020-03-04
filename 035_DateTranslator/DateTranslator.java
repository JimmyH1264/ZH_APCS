import java.util.Scanner;
public class DateTranslator {
    int date;
    int month;
    int year;
    //this sets the variables
    public static void main(String[] args){
        DateTranslator da = new DateTranslator();
        //this is the object, to trick static you have to call yourself
        int type;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the date:");
        da.date = scan.nextInt();
        System.out.println("enter the month:");
        da.month = scan.nextInt();
        System.out.println("enter the year:");
        da.year = scan.nextInt();
        System.out.println("What kind of the calendar do you want to see? 1 for american 2 for european");
        type = scan.nextInt();
        //those are scanners which catches value
        if (type == 1){
            da.arrangeA();
            //methods
        }else{
            da.arrangeE();
            //object.method
        }
        scan.close();
    }
    public void arrangeA(){
        System.out.println(month + "/" + date + "/" + year);
        // if it is not static you have to call the object

    }
    public void arrangeE(){
        System.out.println(date + "/" + month + "/" + year);
        //if it is not static you have to call the object
    }
}