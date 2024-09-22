package src.ShapeOfShapes.shapes;

public class Circle extends Shape{
    double pi = Math.PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
      return radius;
    }

    public double getArea(){    //this method name is now common
        // A = π r^2
       area = pi * Math.pow(radius, 2);
       return area;
       
    }

}
