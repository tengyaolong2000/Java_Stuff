//union and intersection
import java.util.*;

public class Example20 {
    public static void main(String[] args) {
        Integer[] numbers1 = new Integer[]{3, 25, 2, 79, 2};
        Integer[] numbers2 = new Integer[]{7, 12, 14, 79};

        //populate set
        Set<Integer> set1 = new HashSet<>();
        Collections.addAll(set1, numbers1);
        Set<Integer> set2 = new HashSet<>();
        Collections.addAll(set2, numbers2);
        Set<Integer> set3 = new HashSet<>();
        Collections.addAll(set3, numbers1);

        //union
        set1.addAll(set2);
        System.out.println(set1);

        //intersection
        set3.retainAll(set2);
        System.out.println(set3);
    }
}