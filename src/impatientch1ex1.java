//reads in integer and prints in binary, octal and hexadecimal
import java.util.Scanner;  // Import the Scanner class

public class impatientch1ex1 {
    public static void main(String[] args){
        Scanner inpobj = new Scanner(System.in);
        System.out.println("Enter your number");

        String result = inpobj.nextLine();
        int num = Integer.parseInt(result);
        System.out.println("Your number " + num + " in binary, octal and hexadecimal is: " +  Integer.toBinaryString(num) +" "+ Integer.toOctalString(num) + " " +Integer.toHexString(num) );
        System.out.println("Reciprocal as hex floating point number : " + Float.toHexString(num==0 ? 0 : 1/(float)num));


    }
}
