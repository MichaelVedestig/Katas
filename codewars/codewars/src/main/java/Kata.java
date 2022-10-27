// Make sure your class is public
public class Kata {
    public static Double findUniq(double arr[]) {

        if (arr == null){
            return null; // primitive double won't accept null as return type
        }
        double num1 = arr[0];
        double num2 = 0;
        int count = 0;
        for (int i = 1; i < arr.length; i++){

            if (arr[i] == num1){
                count++;
            }
            else{
                 num2 = arr[i];
            }
        }
        if (count == 0)
            return num1;
        return num2;
    }





   double[] arr =                                           {20, 20, 20, 55, 20, 20};




}






