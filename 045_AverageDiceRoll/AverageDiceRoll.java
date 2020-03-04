public class AverageDiceRoll {
    int totalp = 0;
    int totaln = 0;
    int averagep = 0;
    int averagen = 0;
    int numofp = 0;
    int numofn = 0;
    public static void main(String[] args) {
        OneThousandPositiveOrNegativeInts arr = new OneThousandPositiveOrNegativeInts();
        AverageDiceRoll adr = new AverageDiceRoll();
        int[] aray = arr.getOneThousandPositiveOrNegativeInts();
        adr.average(aray);

    }
    public void average(int[] x) {
        int num2 = x.length;
        for (int i = 0 ; i < num2; i ++ ){
            if (x[i] > 0) {
                numofp += 1;
                totalp += x[i];
            }
            else{
                numofn += 1;
                totaln += x[i];
            }

        }
        System.out.println(numofn);
        System.out.println(numofp);
        averagen = totaln / numofn;
        averagep = totalp / numofp;
        System.out.println(totalp);
        System.out.println(totaln);
        System.out.println(averagep);
        System.out.println(averagen);
    }
}