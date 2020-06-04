public class LinearSearch {
    public int search(int x, int[] aray) {
        int index = 0;
        for (int i = 0; i < aray.length; i++){
            if (aray[i] == x){
                index = i;
            }else{
                index = -1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        OneThousandSortedRandomNumbers ostrn = new OneThousandSortedRandomNumbers();
        LinearSearch ls = new LinearSearch();
        int[] aray = ostrn.getSortedArray();
        ls.search(7250,aray);
        ls.search(9463,aray);
        ls.search(1137,aray);
        ls.search(4837,aray);

}
}