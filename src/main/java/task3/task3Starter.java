package task3;

public class task3Starter {
    public static void main(String[] args) {
        Circle circle = new Circle(32);
        circle.calculatedPerimeter();
        circle.calculatedSquare();
        System.out.println(circle);

        Triangle triangle = new Triangle(11, 12, 13);
        triangle.calculatedPerimeter();
        triangle.calculatedSquare();
        System.out.println(triangle);

        Rectangle rectangle = new Rectangle(11, 12);
        rectangle.calculatedPerimeter();
        rectangle.calculatedSquare();
        System.out.println(rectangle);
    }
}
