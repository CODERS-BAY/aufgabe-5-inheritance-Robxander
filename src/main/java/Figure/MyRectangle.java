package Figure;

public final class MyRectangle extends Rectangle{
    String color;

    public MyRectangle (String figureName, double length, double width, String color){
        super(figureName, length, width);
        this.color = color;
    }

    public String getDescripiton(){
        return String.format("My %s %s has %.2f perimeter and %.2f area ", color, getName(),
                calcPerimeter(), calcArea());
    }
}
