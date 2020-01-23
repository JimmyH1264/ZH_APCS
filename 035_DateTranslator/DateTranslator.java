import java.util.Scanner;
public class DateTranslator {
    int date;
    int month;
    int year;
    public static void main(String[] args){
        DateTranslator da = new DateTranslator();
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
        if (type == 1){
            da.arrangeA();
        }else{
            da.arrangeE();
        }
    }
    public void arrangeA(){
        System.out.println(month + "/" + date + "/" + year);

    }
    public void arrangeE(){
        System.out.println(date + "/" + month + "/" + year);
    }
}