package task3and4;

public class Rectangle extends Shape {

    static {
        System.out.println("Enter the length and width for the rectangle");
    }

    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void calculateAndPrintPerimeter() {
        System.out.println("Rectangle perimeter " + (firstSide + secondSide) * 2);
    }

    @Override
    public void calculateAndPrintArea() {
        System.out.println("Rectangle area " + firstSide * secondSide);
    }
}
