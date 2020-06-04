public class SelectionSorter {
    public int[] sort(int[] x){
        for (int i = 0; i < x.length; i++){
            for (int j = 1; j < x.length; j++){
                if( x[i] > x[j]){
                    x[j] = x[i];
                }
            }
        }
        return x;
    }
    public static void main(String[] args){
        UnsortedArrays usa = new UnsortedArrays();
        SelectionSorter ss = new SelectionSorter();
        ss.sort(usa);

    }
}