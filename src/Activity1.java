public class Activity1 {
    public static void main(String[] args) {
        if (args.length != 2) {System.err.println("ERROR!"); System.exit(-1);}

        int systol = Integer.parseInt(args[0]);
        int diastol = Integer.parseInt(args[1]);

        if (systol<90 || diastol <60) System.out.println("Low blood pressure");
        else if (systol>140 || diastol >90) System.out.println("High blood pressure");
        else if (systol>120 || diastol >80) System.out.println("Pre-high blood pressure");
        else System.out.println("Ideal Blood pressure!");

    }
}
