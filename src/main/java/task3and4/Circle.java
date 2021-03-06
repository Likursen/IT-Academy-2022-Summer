package task3and4;

public class Circle extends Shape {

    static {
        System.out.println("Enter the radius for the circle");
    }

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateAndPrintPerimeter() {
        System.out.println("Circle perimeter: " + Math.PI * 2 * radius);
    }

    @Override
    public void calculateAndPrintArea() {
        System.out.println("Circle area " + Math.pow(Math.PI, 2) * radius);
    }
}