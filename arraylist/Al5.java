import java.util.ArrayList;

public class Al5 {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        
        // Adding elements to the ArrayList
        list.add(17);
        list.add(23);
        list.add(31);
        list.add(46);
        list.add(52);
        
        // Printing the original list
        System.out.println("Original list: " + list);
        
        // Reversing the ArrayList
        reverseList(list);
        
        // Printing the reversed list
        System.out.println("Reversed list: " + list);
    }
    
    public static void reverseList(ArrayList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            // Swap elements at positions i and (size - 1 - i)
            Integer temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }
    }
}
