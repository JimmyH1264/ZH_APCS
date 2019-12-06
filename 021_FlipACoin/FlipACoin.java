public class FlipACoin{
    public static void main(String[] args){
        int coin = (int)(Math.random()+0.5);
        //this either returns 1 or 2, im not sure 100% that they are equal chances tho
        System.out.println(coin);
        //checking statement
        if(coin == 1){
            //if (){}this is how you do it if coin equals 1 it returns the head
            System.out.println("Head");
        }else{
            //any other thing will fall in the else thing and it will print out tail
            System.out.println("Tail");
            //printing statement
        }

    }
}