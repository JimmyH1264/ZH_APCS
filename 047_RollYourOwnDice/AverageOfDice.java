import java.util.*;
public class AverageOfDice {
    ArrayList<Integer> dices = new ArrayList<Integer>();
    int num = 100;
    int total = 0;
    public ArrayList returnD() {
        
        for (int i = 0; i < num; i++){
            dices.add((int)(Math.random()*100+1));
        }
        return dices; 

    }
    public void returnA(ArrayList<Integer> x){
        int total = 0;
        for (int i : x){
            total += i;

        }
        System.out.println(total/100);
    }
    public static void main(String[] args) {
        AverageOfDice aood = new AverageOfDice();
        aood.returnD();
        System.out.println(aood.dices.size());
        System.out.println(aood.dices.get(99));
        aood.returnA(aood.dices);


    }

}