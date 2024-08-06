public class Ls4 {

    public static int countOccurrences(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++; // Increment count if the target character is found
            }
        }
        return count;     }

    public static void main(String[] args) {
        String str = "hello world";
        char target = 'o';

        int result = countOccurrences(str, target);

        System.out.println("The character '" + target + "' appears " + result + " times in the string.");
    }
}
