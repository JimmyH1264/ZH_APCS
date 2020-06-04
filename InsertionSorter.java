public class InsertionSorter {
    public int[] sort(int[] x){
        int[] y = new int[x.length];
        for (int i = 0; i < x.length; i++){
            for (int j = 1; j < x.length; j++){
                if( x[i] > x[j]){
                    x[j] = x[i];
                }
            }
        }
        return y;

    }

    public static void main(String[] args){
        UnsortedArrays usa = new UnsortedArrays();
        InsertionSorter is = new InsertionSorter();
        is.sort(usa);

    }
}