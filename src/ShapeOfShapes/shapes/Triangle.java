package src.ShapeOfShapes.shapes;

public class Triangle extends Shape {
    private double width, height; 
    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight(){
      return height;
    }

    public double getWidth(){
      return width;
    }

    public double getArea()
    {
      area = (width * height)/2;
      return area;
    }
    
}
