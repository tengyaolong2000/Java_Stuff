//factorial with BigInteger
import java.math.BigInteger;

public class impatientch1ex6 {
    public static BigInteger factorial(BigInteger x){
        if(x.equals(BigInteger.ZERO)) return BigInteger.ONE;

        else {
            return x.multiply(factorial(x.subtract(BigInteger.ONE)));
        }

    }

    public static void main(String[] args){
        System.out.print(factorial(BigInteger.valueOf(1000)));

    }
}
