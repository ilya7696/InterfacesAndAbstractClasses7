package by.tovpenets.figure;

public class Triangle extends Figure {

    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Formula is P = a + b + c
     */
    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    /**
     *  p - half of perimeter
     *  temp - p * (p - a) * (p - b) * (p - c)
     *  Formula is square of temp
     */
    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        double temp = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(temp);
    }
}
