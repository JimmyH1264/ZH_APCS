public class TabletopDice {
    public static void main(String[] args) {
        int d4 = (int)(Math.random()* 4 + 1);
        //random returns 0 - 1, and int eliminates the decimals so i have to add 1,and 4 sides i times 4
        System.out.println(d4);
        //this prints out the number of d4
        int d6 = (int)(Math.random()* 6 + 1);
        //random returns 0 - 1, and int eliminates the decimals so i have to add 1,and 6 sides i times 6
        int d8 = (int)(Math.random()* 8 + 1);
        //random returns 0 - 1, and int eliminates the decimals so i have to add 1,and 8 sides i times 8
        int d10 = (int)(Math.random()* 10 + 1);
        //random returns 0 - 1, and int eliminates the decimals so i have to add 1,and 10 sides i times 10
        System.out.println(d6);
        System.out.println(d8);
        System.out.println(d10);
        //printing statement
        int Percentile = ((int)(Math.random()* 10 + 1)*10);
        //it only returns 10 20 30 40 so i have to times 10 after the random number
        System.out.println(Percentile);
        int d12 = (int)(Math.random()* 12 + 1);
        int d20 = (int)(Math.random()* 20 + 1);
        //same as top
        System.out.println(d12);
        System.out.println(d20);
        //print statement

    }
}