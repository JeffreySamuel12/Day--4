import java.util.ArrayList;
import java.util.List;

public class Ls6 {

    public static List<Integer> findAllOccurrences(int[] array, int target) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                indices.add(i); // Add the index to the list if the target is found
            }
        }
        return indices; // Return the list of indices
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 30, 50, 30};
        int target = 30;

        List<Integer> result = findAllOccurrences(array, target);

        System.out.println("The number " + target + " appears at the following indices: " + result);
    }
}
