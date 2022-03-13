package by.tovpenets.figure;

public class Rectangle extends Figure {

    private final double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Formula is P = 2 * (a + b)
     */
    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    /**
     * Formula is S = а * b
     */
    @Override
    public double getArea() {
        return a * b;
    }
}
