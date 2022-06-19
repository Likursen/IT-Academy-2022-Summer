package task4;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateAndPrintPerimeter() {
        System.out.println("периметр круга " + Math.PI * 2 * radius);
    }

    @Override
    public void calculateAndPrintSquare() {
        System.out.println("площадь круга " + Math.pow(Math.PI, 2) * radius);
    }
}