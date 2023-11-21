package Figure;

public class Circle extends Figure {
    private double radius;
    private static final String CIRCLE_NAME = "circle";

    public Circle(double radius) {
        super(CIRCLE_NAME);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return radius * radius * 3.14;
    }

    @Override
    public double calcPerimeter() {
        return 2 * radius * 3.14;
    }
}
