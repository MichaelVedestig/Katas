public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int n = 0;
        int s = 0;
        int w = 0;
        int e = 0;

        int allowedLengthOfWalk = 10;
        if (walk.length != allowedLengthOfWalk)
            return false;
        for (int i = 0; i < walk.length; i++){
            switch (walk[i]){
                case 'n':
                    n++;
                    break;
                case 's':
                    s++;
                    break;
                case 'w':
                    w++;
                    break;
                case 'e':
                    e++;
                    break;
                default:
                    break;
            }
        }
        if (n == s && w == e)
            return true;
        return false;
    }
}