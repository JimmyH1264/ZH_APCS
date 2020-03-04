import java.util.*;
public class CleanTempSensorData {

    public static void main(String[] args) {
        SensorData sd = new SensorData();
        CleanTempSensorData ctsd = new CleanTempSensorData();
        int[] datas = sd.getTempSensorData();
        ArrayList<Integer> newdata = new ArrayList<Integer>();
        ctsd.clean(datas,newdata);
        for (int i : newdata){
            System.out.print(i + " ");
        }
        
    }

    public ArrayList clean(int[] x, ArrayList<Integer> y) {
        
        for (int j : x) {
            if (j < 15) {
                y.add(j);
            }
        }
        return y;
    }
}