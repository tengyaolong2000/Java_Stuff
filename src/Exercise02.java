public class Exercise02 {
    public static void main(String[] args) {
        int maxDistance = 10; //km
        int distanceToHome = 11;

        if (distanceToHome > maxDistance) {
            System.out.println("Distance from the store to your home is");
            System.out.println("More than " + maxDistance + " km away");
            System.out.println("That is too far for free delivery!");
        }

        if (distanceToHome <= maxDistance) {
            System.out.println("Distance from the store to your home is within" + maxDistance + "km away");
            System.out.println("You get free food delivery!");
        }
    }
}
