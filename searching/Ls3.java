public class Ls3 {
    public static int findFirstOccurrence(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 30};
        int target = 30;

        int result = findFirstOccurrence(array, target);

        if (result != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + result);
        } else {
            System.out.println(target + " is not found in the array.");
        }
    }
}
