import java.text.*;
// i dont even need this but thisis for compare ignorecase
import java.util.Scanner;
//import scanner
public class DoubloonWords {
    public static void main(String[] args) {
        String doub;
        //this is a string thing for scanner to input
        Scanner scan = new Scanner(System.in);
        //make a scanner object
        System.out.println("Enter a word:");
        //input statement
        doub = scan.next();
        //catching a string
        int length = doub.length();
        //finding a length of the string
        int maximumA = doub.length() - doub.replaceAll("a","").length();
        int maximumB = doub.length() - doub.replaceAll("b","").length();
        int maximumC = doub.length() - doub.replaceAll("c","").length();
        int maximumD = doub.length() - doub.replaceAll("d","").length();
        int maximumE = doub.length() - doub.replaceAll("e","").length();
        int maximumF = doub.length() - doub.replaceAll("f","").length();
        int maximumG = doub.length() - doub.replaceAll("g","").length();
        int maximumH = doub.length() - doub.replaceAll("h","").length();
        int maximumI = doub.length() - doub.replaceAll("i","").length();
        int maximumJ = doub.length() - doub.replaceAll("j","").length();
        int maximumK = doub.length() - doub.replaceAll("k","").length();
        int maximumL = doub.length() - doub.replaceAll("l","").length();
        int maximumM = doub.length() - doub.replaceAll("m","").length();
        int maximumN = doub.length() - doub.replaceAll("n","").length();
        int maximumO = doub.length() - doub.replaceAll("o","").length();
        int maximumP = doub.length() - doub.replaceAll("p","").length();
        int maximumQ = doub.length() - doub.replaceAll("q","").length();
        int maximumR = doub.length() - doub.replaceAll("r","").length();
        int maximumS = doub.length() - doub.replaceAll("s","").length();
        int maximumT = doub.length() - doub.replaceAll("t","").length();
        int maximumU = doub.length() - doub.replaceAll("u","").length();
        int maximumV = doub.length() - doub.replaceAll("v","").length();
        int maximumW = doub.length() - doub.replaceAll("w","").length();
        int maximumX = doub.length() - doub.replaceAll("x","").length();
        int maximumY = doub.length() - doub.replaceAll("y","").length();
        int maximumZ = doub.length() - doub.replaceAll("z","").length();
        //find numbers of each letters in the word
            System.out.println(maximumA);
            //checking the numbers
            if (length % 2 == 0){
                //check if the word is even or odd
                if (maximumA % 2 == 0 && maximumB % 2 == 0 && maximumC % 2 == 0 && maximumD % 2 == 0 && maximumE % 2 == 0 && maximumF % 2 == 0 && maximumG % 2 == 0 && maximumH % 2 == 0 && maximumI % 2 == 0 && maximumJ % 2 == 0 && maximumK % 2 == 0 && maximumL % 2 == 0 && maximumM % 2 == 0 && maximumN % 2 == 0 && maximumO % 2 == 0 && maximumP % 2 == 0 && maximumQ % 2 == 0 && maximumR % 2 == 0 && maximumS % 2 == 0 && maximumT % 2 == 0 && maximumU % 2 == 0 && maximumV % 2 == 0 && maximumW % 2 == 0 && maximumX % 2 == 0 && maximumY % 2 == 0 && maximumZ % 2 == 0 )
                //check if each letter is even or odd 
                {
                    if (maximumA  == 2 || maximumB  == 2 || maximumC  == 2 || maximumD  == 2 || maximumE  == 2 || maximumF  == 2 || maximumG  == 2 || maximumH  == 2 || maximumI  == 2 || maximumJ  == 2 || maximumK  == 2 || maximumL  == 2 || maximumM  == 2 || maximumN  == 2 || maximumO  == 2 || maximumP  == 2 || maximumQ  == 2 || maximumR  == 2 || maximumS  == 2 || maximumT  == 2 || maximumU  == 2 || maximumV  == 2 || maximumW  == 2 || maximumX  == 2 || maximumY  == 2 || maximumZ  == 2 ||maximumA  == 0 || maximumB  == 0 || maximumC  == 0 || maximumD  == 0 || maximumE  == 0 || maximumF  == 0 || maximumG  == 0 || maximumH  == 0 || maximumI  == 0 || maximumJ  == 0 || maximumK  == 0 || maximumL  == 0 || maximumM  == 0 || maximumN  == 0 || maximumO  == 0 || maximumP  == 0 || maximumQ  == 0 || maximumR  == 0 || maximumS  == 0 || maximumT  == 0 || maximumU  == 0 || maximumV  == 0 || maximumW  == 0 || maximumX  == 0 || maximumY  == 0 || maximumZ  == 0 )
                    //check if each letter is equqal 0 or 2 i dont know how i did it but it works maybe i dont even need this step
                    {
                        if(maximumA  > 2 || maximumB  > 2 || maximumC  > 2 || maximumD  > 2 || maximumE  > 2 || maximumF  > 2 || maximumG  > 2 || maximumH  > 2 || maximumI  > 2 || maximumJ  > 2 || maximumK  > 2 || maximumL  > 2 || maximumM  > 2 || maximumN  > 2 || maximumO  > 2 || maximumP  > 2 || maximumQ  > 2 || maximumR  > 2 || maximumS  > 2 || maximumT  > 2 || maximumU  > 2 || maximumV  > 2 || maximumW  > 2 || maximumX  > 2 || maximumY  > 2 || maximumZ  > 2)
                        //check if those even numbers are bigger than2 if they are they are not doubloon
                        {
                            System.out.println("it is not because it is only two letters in the word.");
                            //if it is even but 4 letters it doesnt work
                        }
                        else{
                            System.out.println("it is a doubloon");
                            // even two letters or no letters
                        }
                    }
                    else{
                        System.out.println("it is not becasue there should only be 2 letters for each");
                        //this is literally the same thing as the below so that why i thought i dont even need this if
                    }
                }
                else{
                    System.out.println("it is not because not all letters in there are even");
                    //odd letters in even word doesnt work
                }
            }bvhhgdhdddhf
            else{
            System.out.println("Doubloon words' total number of letters are even.");
            //odd number doesnt work
        }
        
    }
}