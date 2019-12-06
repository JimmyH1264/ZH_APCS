public class SimpleCounterButAForLoop {
    public static void main(String[] args) {
        for (int i = 300; i >= 0; i--){
            System.out.print(i + " ");
        }
        //for () {}
        //starting number i = 300; and i is decreasing till it hits 0
        System.out.println(" ");
        for (int i = 0; i <= 300; i++){
            System.out.print(i + " ");
        }
        // i is increasing till it hits 300
        System.out.println(" ");
        for (int i = 5324; i >= 4798; i--){
            System.out.print(i + " ");
        }
        //i is decreasing till it hits 4798
        System.out.println(" ");
        for (int i = 4798; i <= 5324; i++){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        //i is increasing from 4798 till it hits 5324
    }
}