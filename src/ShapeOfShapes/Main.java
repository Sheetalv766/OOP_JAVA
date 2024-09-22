package src.ShapeOfShapes;

import src.ShapeOfShapes.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5);
        System.out.println("Area of Circle : " + shape1.getArea());

        Shape shape2 = new Triangle(5, 10);
        System.out.println("Area of Triangle : " + shape2.getArea());

    }
//   public static void main(String[] args) {
//         Circle shape1 = new Circle(5);
//         Triangle shape2 = new Triangle(5, 10);

//         printArea(shape1);
//         printArea(shape2);
//     }
//     public static void printArea(Shape shape){
//         System.out.println("Area: " + shape.calculateArea());
//     }  
}
