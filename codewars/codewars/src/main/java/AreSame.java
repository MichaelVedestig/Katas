public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if(a == null || b == null || a.length != b.length) {
            return false;
        }
        for (int numA : a){
            boolean matchA = false;
            for (int numB : b){
                if (numB == numA * numA){
                    matchA = true;
                    break;
                }
            }
            if ( matchA == false) {
                return false;
            }
        }
        for (int numB : b){
            boolean matchB = false;
            for (int numA : a){
                if (numB == numA * numA){
                    matchB = true;
                    break;
                }
            }
            if ( matchB == false) {
                return false;
            }
        }
        return true;
    }
}
