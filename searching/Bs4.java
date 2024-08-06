public class Bs4 {
    public static int findSmallestGreaterOrEqual(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] >= target) {
                result = mid; // Update result and move left to find a smaller element
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    public static int findLargestSmallerOrEqual(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] <= target) {
                result = mid; // Update result and move right to find a larger element
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 8, 10};
        int target = 5;

        int smallestGreaterOrEqual = findSmallestGreaterOrEqual(array, target);
        int largestSmallerOrEqual = findLargestSmallerOrEqual(array, target);

        System.out.println("Smallest element greater than or equal to " + target + " is at index: " + smallestGreaterOrEqual);
        System.out.println("Largest element smaller than or equal to " + target + " is at index: " + largestSmallerOrEqual);
    }
}
