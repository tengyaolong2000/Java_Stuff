class Computer {
    //variables
    public double cpuSpeed; //in GHz

    //constructor
    Computer(){
        cpuSpeed = 0;
    }

    //methods
    void setCpuSpeed(double _cpuSpeed){
        cpuSpeed = _cpuSpeed;
    }

    double getCpuSpeed() {
        return cpuSpeed;
    }
}

public class Example09 {
    public static void main(String[] args){
        Tablet myTab = new Tablet();
        myTab.setCpuSpeed(2.5);
        myTab.setScreensize(20);
        System.out.println(myTab.cpuSpeed);
        System.out.println(myTab.getScreensize());
    }
}

class Tablet extends Computer {
    //variables
    private double screensize;

    //methods
    void setScreensize ( double _screenSize){
        screensize = _screenSize;

    }
    double getScreensize(){
        return screensize;
    }
}
