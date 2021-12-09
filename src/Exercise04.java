public class Exercise04 {
    public static void main(String[] args){
        int season = 3;
        String message;
    //Different types of switch statements
        /*switch(season){
            case 1: message = "Spring";
            break;
            case 2: message = "Summer";
            break;
            case 3: message = "Fall";
            break;
            case 4: message = "Winter";
            break;
            default: message = "That's not a season";
            break;
        } */

        //Second type
        String taste = "Way too hot";
        int tempAdjustment = switch(taste) {
            case "Too cold" -> 1;
            case "Way too hot" -> -2;
            case "Too hot" -> -1;
            case "Just right" -> 0;
            default -> 0;
        };
        System.out.println(tempAdjustment);
    }

}
