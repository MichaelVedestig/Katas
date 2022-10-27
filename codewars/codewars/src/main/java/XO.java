public class XO {

    public static boolean getXO (String str) {

        int os = 0;
        int xs = 0;
        char[] arr = str.toLowerCase().toCharArray();

        for (char c : arr){
            if (c == 'o')
                os++;
            if (c == 'x')
                xs++;
        }
        if (os == xs)
            return true;
        return false;
    }

}