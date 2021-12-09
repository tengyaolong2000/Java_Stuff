public class Exercise00 {

    public static void main(String[] args) {
        String t = "";
        System.out.println(t);
        t = t + "Joe...";
        System.out.println(t);
        t = t + " went fishing";
        System.out.println(t);

        float f = 51.49f;
        System.out.println(f);
        int i = Math.round(f);
        System.out.println(i);

        //equation to solve hypotenuse
        double a = 3;
        double b = 4;
        double h = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println(h); //print out the results

        int c=3, d=4, m=0;
        String r="The minimum value is: ";
        m = Math.min(c,d);
        System.out.println(r+m); //print out the results
    }
}
