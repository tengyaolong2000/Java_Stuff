import java.util.Arrays;

public class Example17 {
    public static void main(String[] args){
        int[] numbers = new int[5];
        Arrays.fill(numbers, 1);
        System.out.println(Arrays.toString(numbers));
        int[] shortNumbers = Arrays.copyOfRange(numbers, 0, 2);
        System.out.println(Arrays.toString(shortNumbers));
        int[] longNumbers = Arrays.copyOfRange(numbers,0,10);
        boolean comparison = Arrays.equals(numbers, shortNumbers);
        System.out.println(comparison);
        System.out.println(Arrays.toString(longNumbers));
    }
}
