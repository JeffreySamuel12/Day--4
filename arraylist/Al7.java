import java.util.ArrayList;

public class Al7 {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        
        // Adding elements to the ArrayList
        list.add(25);
        list.add(23);
        list.add(49);
        list.add(17);
        list.add(61);
        
        // Printing the original list
        System.out.println("Original list: " + list);
        
        // Sorting the ArrayList
        customSort(list);
        
        // Printing the sorted list
        System.out.println("Sorted list: " + list);
    }
    
    public static void customSort(ArrayList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Swap elements
                    Integer temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
