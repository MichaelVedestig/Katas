import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
//       ArrayList<Double> list = new ArrayList<>(Arrays.asList(s));
//        for (int i = 0; i < n - 3; i++){
//            list.add(list.get(i) + list.get(i+1) + list.get(i+2));
//        }
//        s = list.toArray(new Double().doubleValue().);
        double[] arr = new double[n];
        for(int i = 0; i < s.length && i < n; i++) {
            arr[i] = s[i];
        }
        for (int i = 0; i < n - 3; i++){
            arr[i+3] = arr[i] + arr[i+1] + arr[i+2];
        }
        System.out.println(Arrays.toString(arr));

        return arr;
    }

}
