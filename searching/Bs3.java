public class Bs3 {
    public static int findFirstOccurrence(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                result = mid; // Update result and move left to find the first occurrence
                right = mid - 1;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static int findLastOccurrence(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                result = mid; // Update result and move right to find the last occurrence
                left = mid + 1;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int firstOccurrence = findFirstOccurrence(array, target);
        int lastOccurrence = findLastOccurrence(array, target);

        System.out.println("First occurrence of " + target + " is at index: " + firstOccurrence);
        System.out.println("Last occurrence of " + target + " is at index: " + lastOccurrence);
    }
}
