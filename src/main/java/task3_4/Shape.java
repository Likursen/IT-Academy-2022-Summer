package task3_4;

public abstract class Shape implements Square, Perimeter {
    private int firstParam;
    private int secondParam;
    private int thirdParam;
    private double square;
    private double perimeter;

    public int getFirstParam() {
        return firstParam;
    }

    public void setFirstParam(int firstParam) {
        this.firstParam = firstParam;
    }

    public int getSecondParam() {
        return secondParam;
    }

    public void setSecondParam(int secondParam) {
        this.secondParam = secondParam;
    }

    public int getThirdParam() {
        return thirdParam;
    }

    public void setThirdParam(int thirdParam) {
        this.thirdParam = thirdParam;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "square=" + square +
                ", perimeter=" + perimeter +
                '}';
    }
}
