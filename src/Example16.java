//Inner classes and private classes
class Container {
    private class Continent {
        public void print(){
            System.out.println("This is an inner class");
        }
    }
    //method to give access to the private inner class method
    void printContinent(){
        Continent continent = new Continent();
        continent.print();
    }
}



public class Example16 {
    public static void main(String[] args){
        Container contain = new Container();
        contain.printContinent();


        Container container =  new Container(){
            @Override
            public void printContinent(){
                System.out.print("Override active");
            }

        };
        container.printContinent();
    }
}
