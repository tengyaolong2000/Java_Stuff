//Annotations

class Computer1 {
    @Deprecated
    public void whatIsIt(){
        System.out.println("it is a PC");
    }
    public void getDeviceType(){
        System.out.println("it is a PC");
    }
}
@SuppressWarnings("deprecation")
class Tablet1 extends Computer1 {
    @Override
    public void whatIsIt(){
        System.out.println("it is a tablet");
    }
}

public class Example14 {
    public static void main(String[] args){
        Computer1 com = new Computer1();
        com.whatIsIt();
        com.getDeviceType();

        Tablet1 tab = new Tablet1();
        tab.whatIsIt();
    }

}
