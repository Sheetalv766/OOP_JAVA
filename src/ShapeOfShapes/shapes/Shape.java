package src.ShapeOfShapes.shapes;

public abstract class Shape {
    public double area;
    public abstract double getArea();
    public void printArea()
    {
        System.out.println(area);
    }
 }

