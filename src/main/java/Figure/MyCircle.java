package Figure;

public final class MyCircle extends Circle{
   private String color;

    public MyCircle( double radius, String color ){
        super( radius);
        this.color = color;
    }


    public String getDescription(){
        return String.format("My %s %s has %.2f perimeter and  %.2f  area", color, getName(), calcPerimeter(), calcArea() );

    }
}
