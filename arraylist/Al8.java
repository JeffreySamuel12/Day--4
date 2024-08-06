import java.util.ArrayList;

public class Al8 {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        
        // Adding elements to the ArrayList
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(6);
        
        // Finding the largest and smallest elements
        int largest = findLargest(list);
        int smallest = findSmallest(list);
        
        // Printing the largest and smallest elements
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
    
    public static int findLargest(ArrayList<Integer> list) {
        int largest = list.get(0);
        for (int num : list) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }
    
    public static int findSmallest(ArrayList<Integer> list) {
        int smallest = list.get(0);
        for (int num : list) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }
}
