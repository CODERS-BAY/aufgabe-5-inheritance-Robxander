package main;

import Figure.MyCircle;
import Figure.MyRectangle;

public class Figures {
    public static void main(String[] args) {


        MyCircle circle1 = new MyCircle(5, "blue");
        System.out.println(circle1.getDescription());

        MyRectangle rectanlge1 = new MyRectangle("recti1", 10, 10, "white");
        System.out.println(rectanlge1.getDescripiton());


        // Uncomment the code below when you are done implementing

        /*
        MyCircle c1 = new MyCircle("blue",7);
        System.out.println(c1.getDescription());

        MyCircle c2 = new MyCircle("purple",3);
        System.out.println(c2.getDescription());

        MyRectangle r1 = new MyRectangle("orange",5,2);
        System.out.println(r1.getDescription());

        MyRectangle r2 = new MyRectangle("red",8,7);
        System.out.println(r2.getDescription());
        */

    }


}
