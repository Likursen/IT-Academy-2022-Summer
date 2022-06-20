package task3and4;

public class Triangle extends Shape {

    static {
        System.out.println("Enter the length of thee sides for the triangle");
    }

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
        System.out.println("Triangle perimeter " + getPerimeter());
    }

    private double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public void calculateAndPrintArea() {
        double halfPerimeter = getPerimeter() / 2;
        System.out.println("Triangle area " + Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) *
                (halfPerimeter - secondSide) * (halfPerimeter - thirdSide)));
    }
}