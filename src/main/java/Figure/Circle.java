package Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(String figureName, double radius ){
        super(figureName);
        this.radius = radius;
    }

    @Override
    public double calcArea (){
        return radius * radius *3.14;
    }

    @Override
    public double calcPerimeter(){
        return 2 * radius * 3.14;
    }
}
