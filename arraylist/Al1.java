import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Al1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        boolean hasDuplicates = false;
        StringBuilder duplicates = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    duplicates.append(list.get(i)).append("\n");
                    hasDuplicates = true;
                    break;
                }
            }
        }

        if (hasDuplicates) {
            System.out.println("Duplicate elements:");
            System.out.print(duplicates.toString());
        } else {
            System.out.println("No duplicates found.");
        }
    }
}
