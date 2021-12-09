public class Exercise03 {
    public static void main(String[] args) {
        String cat = new String("cat");
        String dog = new String("dog");

        //using literal strings
        if ("dog".equals(dog)) {
            System.out.println("Dogs are dogs");
        }
        if (dog.equals("dog")) {
            System.out.println("dogs are Dogs");
        }
        if (cat.equals(dog)) {
            System.out.println("Cats and dogs are the same");
        }
        else {System.out.println("Cats and dogs are not the same");}

    }
}