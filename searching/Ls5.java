public class Ls5 {
    
    public static int findMax(int[] array) {
        int max = array[0]; // Assume the first element is the maximum
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; 
            }
        }
        return max; 
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        int maxElement = findMax(array);

        System.out.println("The maximum element in the array is: " + maxElement);
    }
}
