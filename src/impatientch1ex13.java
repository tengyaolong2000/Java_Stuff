import java.util.*;

public class impatientch1ex13 {
    public static void main(String[] args){
        printlotterynumber();
    }


    public static void printlotterynumber() {
        Random generator = new Random();
        Integer[] array1 = new Integer[49];

        for (int j = 0; j < 49; j++) {
            array1[j] = j + 1;
        }
        ArrayList<Integer> base = new ArrayList<Integer>(List.of(array1));
        ArrayList<Integer> pickem = new ArrayList<Integer>();

        for (int i=0; i<6; i++){
            int x = generator.nextInt(49);
            int y = base.get(x);
            pickem.add(y);

        }
        Collections.sort(pickem);
        System.out.println(pickem);
    }





}
