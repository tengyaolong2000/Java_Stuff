//using final keyword to avoid overriding
class Temperature{
    private double t = 25;

    public void setT(double x){
        t = x;
    }
    public double getCelsius(){
        return t;
    }
    final public double getFarenheit(){
        return t * 9/5 +32;
    }
}

public class Example11 {
    public static void main(String[] args){
        Temperature temp = new Temperature();

        temp.setT(30);

        System.out.println(temp.getCelsius());
        System.out.println(temp.getFarenheit());

    }
}
