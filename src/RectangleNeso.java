
class Rectangle1 {
     private double width ;
     private double height ;

     public Rectangle1(){
          this(1.0, 1.0);
     };
     public Rectangle1(double width, double height){
          this.width = width;
          this.height = height;
     }
     public double getArea(){
          return this.width * this.height;
     }

     public double getPerimeter(){
          return 2*this.width + 2*this.height;
     }

     public double getWidth(){
          return this.width;
     }

     public double getHeight(){
          return this.height;
     }

     public void setWidth(double width) {
          this.width = width;
     }

     public void setHeight(double height) {
          this.height = height;
     }
}

public class RectangleNeso {

     public static void main(String[] args) {
          Rectangle1 rec = new Rectangle1(2,3);
          System.out.println(rec.getArea());
     }
}

