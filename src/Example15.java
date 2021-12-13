interface Computer2 {
    public String getDeviceType();
    public String getSpeed();
}

class Tablet2 implements Computer2 {
    public String getDeviceType() {
        return "it is a tablet";
    }

    public String getSpeed() {
        return "1GHz";
    }
}


public class Example15 {
    public static void main(String[] args){
        Tablet2 mytab = new Tablet2();
        System.out.println(mytab.getDeviceType());
        System.out.println(mytab.getSpeed());
    }
}
