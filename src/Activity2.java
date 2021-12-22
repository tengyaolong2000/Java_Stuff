public class Activity2 {
    public static void main(String[] args) {
        String[] text = new String[]{"So", "many", "books", "so", "little", "time"};
        String search = "so";
        int occ = -1;

        for (int i = 0; i < 5; i++) {
            if (search.compareToIgnoreCase(text[i]) == 0) {
                occ++;
                System.out.println("Found query at: " + i);
            }
        }
        if (occ > 0) System.out.println("Found " + (++occ) + " coinciding words");

        else System.out.println(occ);
    }
}
