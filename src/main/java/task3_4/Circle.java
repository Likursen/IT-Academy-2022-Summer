package task3_4;

public class Circle extends Shape {
    public Circle(int a) {
        setFirstParam(a);
    }

    @Override
    public void calculatedSquare() {
        setSquare(Math.pow(Math.PI, 2) * getFirstParam());
    }

    @Override
    public void calculatedPerimeter() {
        setPerimeter(Math.PI * 2 * getFirstParam());

    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius=" + getFirstParam() +
                " square=" + getSquare() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}

