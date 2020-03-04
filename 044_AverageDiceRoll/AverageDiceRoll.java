public class AverageDiceRoll {
    int total = 0;
    int average = 0;

    public static void main(String[] args) {
        AverageDiceRoll adr = new AverageDiceRoll();
        OneThousandDiceRolls dice = new OneThousandDiceRolls();
        int[] dices = dice.getDiceRolls();
        adr.average(dices);
        
        
    }
    public void average(int[] x) {
        int num = x.length;
        for (int i = 0; i < num; i++ ) {
            System.out.print(x[i] + " ");
            total += x[i];
            
        }
        average = total/num;
        System.out.println("the average " + average);
    }
}