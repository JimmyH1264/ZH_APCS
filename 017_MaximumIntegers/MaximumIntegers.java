public class MaximumIntegers {
    public static void main(String[] args){
        int x = 2;
        int y = Integer.MAX_VALUE;
        //gives you the biggest int in java
        int z = Integer.MIN_VALUE;
        // gives you the smallest int in java
        int a = y + y + 1000002;
        //if you overflow the biggest it will go to the smallest., so ihave to add another maximum in order to return 0 then i add the number you suppose to add +1
        int b = z - z - 745;
        //smallest to biggest so i have to subtract twice and then minors the actual number
        System.out.println(" y = " + a + " z = " + b);
        //print statement
    }
}