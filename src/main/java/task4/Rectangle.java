package task4;

public class Rectangle extends Shape {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void calculateAndPrintPerimeter() {
        System.out.println("периметр прямоугольника " + (firstSide + secondSide) * 2);
    }

    @Override
    public void calculateAndPrintSquare() {
        System.out.println("площадь прмоугольника " + firstSide * secondSide);
    }
}
