import java.util.ArrayList;
import java.util.HashSet;

public class Al4 {
    public static void main(String[] args) {
     
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
       
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        
        
        HashSet<Integer> unionSet = new HashSet<>(list1);
        unionSet.addAll(list2);
        

        ArrayList<Integer> unionList = new ArrayList<>(unionSet);
        

        System.out.println("Union of the two lists: " + unionList);
    }
}
