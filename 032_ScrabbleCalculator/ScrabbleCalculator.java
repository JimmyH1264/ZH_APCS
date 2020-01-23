import java.util.Scanner;
public class ScrabbleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String scrabbleW;
        System.out.println("Please type a word :");
        scrabbleW = scan.next();
        scrabbleW = scrabbleW.toLowerCase();
        int maximumA = scrabbleW.length() - scrabbleW.replaceAll("a","").length();
        int maximumB = scrabbleW.length() - scrabbleW.replaceAll("b","").length();
        int maximumC = scrabbleW.length() - scrabbleW.replaceAll("c","").length();
        int maximumD = scrabbleW.length() - scrabbleW.replaceAll("d","").length();
        int maximumE = scrabbleW.length() - scrabbleW.replaceAll("e","").length();
        int maximumF = scrabbleW.length() - scrabbleW.replaceAll("f","").length();
        int maximumG = scrabbleW.length() - scrabbleW.replaceAll("g","").length();
        int maximumH = scrabbleW.length() - scrabbleW.replaceAll("h","").length();
        int maximumI = scrabbleW.length() - scrabbleW.replaceAll("i","").length();
        int maximumJ = scrabbleW.length() - scrabbleW.replaceAll("j","").length();
        int maximumK = scrabbleW.length() - scrabbleW.replaceAll("k","").length();
        int maximumL = scrabbleW.length() - scrabbleW.replaceAll("l","").length();
        int maximumM = scrabbleW.length() - scrabbleW.replaceAll("m","").length();
        int maximumN = scrabbleW.length() - scrabbleW.replaceAll("n","").length();
        int maximumO = scrabbleW.length() - scrabbleW.replaceAll("o","").length();
        int maximumP = scrabbleW.length() - scrabbleW.replaceAll("p","").length();
        int maximumQ = scrabbleW.length() - scrabbleW.replaceAll("q","").length();
        int maximumR = scrabbleW.length() - scrabbleW.replaceAll("r","").length();
        int maximumS = scrabbleW.length() - scrabbleW.replaceAll("s","").length();
        int maximumT = scrabbleW.length() - scrabbleW.replaceAll("t","").length();
        int maximumU = scrabbleW.length() - scrabbleW.replaceAll("u","").length();
        int maximumV = scrabbleW.length() - scrabbleW.replaceAll("v","").length();
        int maximumW = scrabbleW.length() - scrabbleW.replaceAll("w","").length();
        int maximumX = scrabbleW.length() - scrabbleW.replaceAll("x","").length();
        int maximumY = scrabbleW.length() - scrabbleW.replaceAll("y","").length();
        int maximumZ = scrabbleW.length() - scrabbleW.replaceAll("z","").length();
        if (maximumA > 9 || maximumB > 2 || maximumC > 2 || maximumD > 4 || maximumE > 12 || maximumF > 2 || maximumG > 3 || maximumH > 2 || maximumI > 9 || maximumJ > 1 || maximumK > 1 || maximumL > 4 || maximumM > 2 || maximumN > 6 || maximumO > 8 || maximumP > 2 || maximumQ > 1 || maximumR > 6 || maximumS > 4 || maximumT > 6 || maximumU > 4 || maximumV > 2 || maximumW > 2 || maximumX > 1 || maximumY > 2 || maximumZ > 1) {
            System.out.println("Your word cant be spelled");
        }
        else
        {
            int point = 0;
            int len = scrabbleW.length()-1;
            for (int i = 0; i <= len; i++){
                String x = scrabbleW.substring(i,i+1);
                if ((x.equals("a") || x.equals("e") || x.equals("i") || x.equals("o") || x.equals("u") || x.equals("l") || x.equals("n") || x.equals("s") || x.equals("t") || x.equals("r")))
                {
                    point ++ ;
                }else if (x.equals("d") || x.equals("g")){
                    point += 2;
                }else if (x.equals("b") || x.equals("c") || x.equals("m") || x.equals("p")){
                    point += 3;
                }else if (x.equals("f") || x.equals("h") || x.equals("v") || x.equals("w") || x.equals("y")){
                    point += 4;
                }else if (x.equals("k") ){
                    point += 5;
                }else if (x.equals("j") || x.equals("x")){
                    point += 8;
                }else if (x.equals("q") || x.equals("z")){
                    point += 10;
                }
            }
            System.out.println(scrabbleW.toLowerCase());
            System.out.println("your word has points of " + point);
        }
        scan.close();

    }
}