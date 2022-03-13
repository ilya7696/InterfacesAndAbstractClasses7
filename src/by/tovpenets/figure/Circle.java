package by.tovpenets.figure;

public class Circle extends Figure {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Formula is P = 2 * π * R
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Formula is S = π * R²
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
