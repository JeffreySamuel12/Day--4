import java.util.ArrayList;
import java.util.Collections;

public class Al6 {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        
        // Adding elements to the ArrayList
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(45);
        list.add(55);
        
        // Number of positions to rotate
        int k = 2;
        
        // Printing the original list
        System.out.println("Original list: " + list);
        
        // Rotating the ArrayList
        rotateList(list, k);
        
        // Printing the rotated list
        System.out.println("Rotated list: " + list);
    }
    
    public static void rotateList(ArrayList<Integer> list, int k) {
        int size = list.size();
        k = k % size; // Handle cases where k is greater than the size of the list
        
        // Reverse the entire list
        reverse(list, 0, size - 1);
        // Reverse the first k elements
        reverse(list, 0, k - 1);
        // Reverse the remaining elements
        reverse(list, k, size - 1);
    }
    
    public static void reverse(ArrayList<Integer> list, int start, int end) {
        while (start < end) {
            Integer temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
}
