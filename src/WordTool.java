import java.util.Locale;

public class WordTool {
    WordTool(){}

    public int wordcount (String s){
        int count = 0; //variable to count words

        if (!(s== null || s.isEmpty())){
            String[] w = s.split("\\s+");
            count = w.length;
        }
        return count;
    }

    public int symbolCount (String s, boolean withSpaces){

        if (!(s==null || s.isEmpty())){
            if (withSpaces){
                return s.length();
            }
            else {
                return s.replace(" ", "").length();
            }
        }
        return 0;
    }

    public int getFrequencey (String s, char x){
        int count =0;
        if (!(s==null || s.isEmpty())){
            for (int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                if (c==x){
                    count +=1;
                }

            }
        }
        return count;
    }

    public static void main(String[] args) {
        WordTool wt = new WordTool();
        String text = "The river carried the memories from his childhood.";
        char x = 't';
        System.out.println("Analyzing text: \n" + text);
        System.out.println("Total words: " + wt.wordcount(text));
        System.out.println("Total words w. spaces: " + wt.symbolCount(text, true));
        System.out.println("Total words w/o spaces: " + wt.symbolCount(text, false));
        System.out.println("Total number of " + x + "'s: " + wt.getFrequencey(text.toLowerCase(Locale.ROOT), x));

    }
}

