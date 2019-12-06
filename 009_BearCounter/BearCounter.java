public class BearCounter {
    public static void main(String[] args){
        int theBear = 0;
        //there is no bear in the beginnning
        theBear++;
        theBear++;
        theBear++;
        //this means i added three bears because i used 3 increments
        System.out.println("Hey, there are " + theBear + " bears coming to the clearing! \n");
        theBear--;
        theBear--;
        theBear--;
        //this means i subtracted 3 bears because i used 3 decrements
        System.out.println("Hey, there are " + theBear + " bears in the clearing! \n");
        System.out.println("The bears are all gone!");
        //a line states that bears are all gone
        
    }
}