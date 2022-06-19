package task4;

public class Triangle extends Shape {

    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public void calculateAndPrintPerimeter() {
        System.out.println("периметр треугольника " + getPerimeter());
    }

    private double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public void calculateAndPrintSquare() {
        double halfPerimeter = getPerimeter() / 2;
        System.out.println("площадь треугольника " + Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) *
                (halfPerimeter - secondSide) * (halfPerimeter - thirdSide)));
    }
}