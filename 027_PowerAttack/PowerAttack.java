public class PowerAttack {
    public static void main(String[] args) {
        int power = 3;
        //basic attack = 3 
        int mArmor = 11;
        //monster armor = 11
        int attack = 0;
        //for some reason to run this program i have to set this this number to 0
        int totalATK = 0;
        //this is suppose to be the total number but ill calculate this later in the while loop
        if (totalATK < mArmor) {
            //if (){}
            while (totalATK < mArmor) {
                //while () {}
                attack = (int)(Math.random()*10 + 1);
                //this generates a number from 1 to 10 
                totalATK = attack + power;
                //this is the random number + 3
                System.out.println("You swang " + totalATK);
                //print statement
                if (totalATK >= mArmor){
                    System.out.println("You beat the monster");
                    //if the total attack is bigger or equal print out you beat it
                }else{
                    System.out.println("You didnt beat the monster");
                    //otherwise you didnt beat the monster                    
                }
            }
        }
    }
}