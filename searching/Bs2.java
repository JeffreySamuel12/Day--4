public class Bs2 {
    public static int findPosition(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Return the index if the target is found
            }

            if (array[mid] < target) {
                left = mid + 1; // Move the left boundary to the right
            } else {
                right = mid - 1; // Move the right boundary to the left
            }
        }

        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 30;

        int result = findPosition(array, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
