public class FindMissingLetter {

    public static char findMissingLetter(char[] array) {
        for (int i = 1; i < array.length; i++){
            if (array[i] - array[i-1] != 1){
                char missingChar = (char)((int)array[i] - 1);
                return missingChar;
            }
        }
        return 'ø';
        }
}
