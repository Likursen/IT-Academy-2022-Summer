package task4;

import java.util.Arrays;
import java.util.List;

public class Starter {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10, 11);
        Triangle triangle = new Triangle(10, 11, 12);
        List<Shape> shapes = Arrays.asList(circle, rectangle, triangle);
        for (Shape shape : shapes) {
            shape.calculateAndPrintPerimeter();
            shape.calculateAndPrintSquare();
        }
    }
}