public class Exercise07 {
    public static void main(String[] args){
        if (args.length > 0){
            int intValue = Integer.parseInt(args[0]);
            System.out.println(intValue);
        }
        if (args.length==2){
            double doubleValue = Double.parseDouble(args[1]);
            System.out.println(doubleValue);
        }
    }
}
