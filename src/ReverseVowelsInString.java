public class ReverseVowelsInString {

    public static void main(String[] args){

        System.out.println(reverseVowels("Hello world!"));
    }

    private static String reverseVowels(String word) {
        if (word == null) {
            return "Error";
        }

        char[] array = word.trim().toCharArray();

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

            char firstChar = array[start];
            char lastChar = array[end];

            if (isVowel(firstChar) && isVowel(lastChar)) {
                array[start] = lastChar;
                array[end] = firstChar;
                start++;
                end--;
            } else if (!isVowel(firstChar) && isVowel(lastChar)) {
                start++;
            } else if (isVowel(firstChar) && !isVowel(lastChar)) {
                end--;
            } else {
                start++;
                end--;
            }

        }

        return String.valueOf(array);
    }

    private static boolean isVowel(char l) {
        return (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u' || l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U');
    }
}
