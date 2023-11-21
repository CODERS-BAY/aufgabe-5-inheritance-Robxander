package Figure;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(String figureName, double length, double width) {
        super(figureName);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calcArea() {
        return length * width;
    }

    @Override
    public double calcPerimeter() {
        return 2 * length + 2 * width;
    }
}
