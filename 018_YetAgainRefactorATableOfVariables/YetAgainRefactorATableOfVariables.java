import java.util.Scanner;
// i have to enter a scanner for input
public class YetAgainRefactorATableOfVariables{
    //this you always need to start java, the things after class is the name of the file
    public static void main(String[] args){
        int theOne = 1;
        //int means the type of the variable(integer in this), so i named it using camosomething, which means the first word is not capitalized
        int theTwo = 2;
        //same as top
        int theThree = 3;
        int theFour = 4;
        System.out.println("a    a^2    a^3");
        System.out.println(theOne + "    " + (int)Math.pow(theOne, 2) + "      " + (int)Math.pow(theOne, 3) );
        System.out.println(theTwo + "    " + (int)Math.pow(theTwo, 2) + "      " + (int)Math.pow(theTwo, 3) );
        System.out.println(theThree + "    " + (int)Math.pow(theThree, 2) + "      " + (int)Math.pow(theThree, 3));
        System.out.println(theFour +"    " + (int)Math.pow(theFour, 2) + "     " + (int)Math.pow(theFour, 3));
        //math.pow(the vairable , the power)
        Scanner scan = new Scanner(System.in);
        //make a scanner object
        System.out.println("which of the row you want to see ? : (integer only or the system will crush)");
        int row1 = scan.nextInt();
        //next integer became the value
        int row = (row1 - 1);
        //because the first line is premade so i have to subtract one
        System.out.println("you entered " + row1 + ", showing row " + row);
        //printing statement
        System.out.println(row +"    " + (int)Math.pow(row, 2) + "     " + (int)Math.pow(row, 3));
        //returns the value of the entered number minors one
    }
}