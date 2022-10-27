import static java.lang.Integer.valueOf;

public class Printer {

    public static String printerError(String s) {
        int denominator = s.length();
        char[] arr = s.toCharArray();
        int count = 0;
        for (char c : arr){
            if (c > 'm')
                count++;
        }
        return count + "/" + denominator;
    }
}