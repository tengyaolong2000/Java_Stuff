public class Exercise05 {
    public static void main(String[] arg){
        String[] letters = {"A", "B", "C", "D", "E"};
        for (String letter: letters){
            if (letter.equals("C")) continue;

            if (letter.equals("D")) break;

            System.out.println(letter);

        }

        int i=0;
        while (i<10){
            System.out.println("Even: "+i);
            i += 2;
        }
    }
}
