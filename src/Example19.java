//populating a set with an array

import java.util.*;

public class Example19 {
    public static void main(String[] args){
        Integer[] myArray = new Integer[]{3,25,2,79,2};
        Set<Integer> mySet = new HashSet<>(Arrays.asList(myArray));
        System.out.println(mySet);
    }
}
