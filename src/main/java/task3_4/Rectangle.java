package task3_4;

public class Rectangle extends Shape {
    public Rectangle(int a, int b) {
        setFirstParam(a);
        setSecondParam(b);

    }

    @Override
    public void calculatedSquare() {
        setSquare(getFirstParam() * getSecondParam());
    }

    @Override
    public void calculatedPerimeter() {
        setPerimeter(getFirstParam() + getSecondParam());
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "side A=" + getFirstParam() +
                " side B=" + getSecondParam() +
                " square=" + getSquare() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}

