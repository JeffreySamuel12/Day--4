import java.util.ArrayList;
import java.util.Scanner;

public class Al2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        ArrayList<Integer> uniqueList = removeDuplicates(list);
        System.out.println("List after removing duplicates: " + uniqueList);
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueList.size(); j++) {
                if (uniqueList.get(j).equals(element)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueList.add(element);
            }
        }

        return uniqueList;
    }
}
