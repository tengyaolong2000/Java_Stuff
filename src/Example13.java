//Recursion

public class Example13 {

    public static long fact( int n){
        if (n==0) return 1;
        return n*fact(n-1);
    }
        public static void main(String[] args){
        int input = Integer.parseInt(args[0]);
        long factorial = fact(input);
        System.out.println(factorial);
        }
}
