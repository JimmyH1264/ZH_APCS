import java.util.*;
public class Solution {


    public int solution(int number) {
      ArrayList<Integer> data = new ArrayList<Integer>();
      int i = 0;

      while ( i < number-1 ){
        i++;
        if (i % 3 == 0 && i % 5 != 0){
          data.add(i);
          }
          else if (i % 3 != 0 && i % 5 == 0) {
            data.add(i);
          }
          else if (i % 3 == 0 && i % 5 == 0) {
            data.add(i);
          }
          }
          int total = 0;
          for (int j : data) {
            System.out.println(j);
            total += j;
          }
          System.out.println(total);
          return total;
          
        }
        public static void main(String[] args) {
            Solution tst = new Solution();
            tst.solution(10);
        }
    }