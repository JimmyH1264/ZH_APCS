import java.util.Scanner;
public class BasicNestedPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String thing;
        int row;
        int col;
        System.out.println("what character do you want to print");
        thing = scan.next();
        int len = thing.length();
        //catching the string
        if (len > 1) {
            System.out.println("You can only put in 1 character.");
            
        }else{
            System.out.println("what rows do you want to print");
            row = scan.nextInt();
            //catching how many rows you want
            System.out.println("what columns do you want to print");
            col = scan.nextInt();
            //catching how many columns you want
            for (int i = 0; i < row; i++){
                for(int x = 0; x < col; x++){
                    System.out.print(thing+" ");
                    //make space for colums
                }
                System.out.println(" ");
                //make space in rows
            }
        }
        scan.close();

    }
}