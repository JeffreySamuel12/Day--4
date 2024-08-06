import java.util.ArrayList;

public class Al9 {
    public static void main(String[] args) {
        // Creating an ArrayList of characters
        ArrayList<Character> list = new ArrayList<>();
        
        // Adding elements to the ArrayList
        list.add('r');
        list.add('a');
        list.add('c');
        list.add('e');
        list.add('c');
        list.add('a');
        list.add('r');
        
        // Checking if the list is a palindrome
        boolean isPalindrome = checkPalindrome(list);
        
        // Printing the result
        if (isPalindrome) {
            System.out.println("The list forms a palindrome.");
        } else {
            System.out.println("The list does not form a palindrome.");
        }
    }
    
    public static boolean checkPalindrome(ArrayList<Character> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            if (!list.get(i).equals(list.get(size - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}
