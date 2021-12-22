//random string of letters and digits base 36
import java.util.Random;

public class impatientch1ex10 {
    public static void printbase36(){
        long x = new Random().nextLong();
        System.out.println(Long.toString(x, 36));
    }

    public static void main(String[] args){
        printbase36();
    }
}
