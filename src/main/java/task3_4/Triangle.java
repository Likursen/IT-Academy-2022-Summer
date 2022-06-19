package task3_4;

public class Triangle extends Figure {
    public Triangle(int a, int b, int c) {
        setFirstParam(a);
        setSecondParam(b);
        setThirdParam(c);
    }

    @Override
    public void calculatedSquare() {
        double halfPerimeter = getPerimeter() / 2;
        double square = Math.sqrt(halfPerimeter * (halfPerimeter - getFirstParam()) * (halfPerimeter - getSecondParam()) *
                (halfPerimeter - getThirdParam()));
        setSquare(square);
    }

    @Override
    public void calculatedPerimeter() {
        setPerimeter(getFirstParam() + getSecondParam() + getThirdParam());
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "side A=" + getFirstParam() +
                " side B=" + getSecondParam() +
                " side C=" + getThirdParam() +
                " square=" + getSquare() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}

