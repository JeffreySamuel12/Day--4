public class Ls2 {
    public static int Ls2(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]==(target)) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        String[] array = {"apple", "banana", "cherry", "date", "elderberry"};
        String target = "cherry";

        int result = linearSearch(array, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
