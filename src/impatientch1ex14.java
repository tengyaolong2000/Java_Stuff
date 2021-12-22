//check if 4x4 array is magic square
import java.util.Scanner;

public class impatientch1ex14 {
    public static void main(String[] args) {
    if (ismagicquare()) System.out.println("Yes");
    else System.out.println("No");
    }



    public static boolean ismagicquare(){
        Scanner scan = new Scanner(System.in);
        int[][] inputarray = new int[4][4];

        System.out.println("Enter your array values, row by row (4x4): ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                inputarray[i][j] = scan.nextInt();

            }
        }
        int sum = 0;
        for (int i : inputarray[0]) {
            sum += i;
        }

        for (int i = 0; i < 4; i++) {
            int compare = 0;
            for (int j = 0; j < 4; j++) {
                compare += inputarray[i][j];

            }
            if (compare != sum) return false;
        }

        for (int i = 0; i < 4; i++) {
            int compare = 0;
            for (int j = 0; j < 4; j++) {
                compare += inputarray[j][i];

            }
            if (compare != sum) return false;
        }
        int compared1 = 0;
        int compared2 = 0;
        for (int i = 0; i < 4; i++) {
            compared1 += inputarray[i][i];
            compared2 += inputarray[i][3 - i];
        }

        return compared1 == sum && compared2 == sum;

    }
}
