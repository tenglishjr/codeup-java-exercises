package shapes;

import org.w3c.dom.css.Rect;

public class ShapesTest {

    public static void main(String[] args) {

//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());

//        Square box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

        Measurable myShape = new Rectangle(3, 5);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Square(4);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

    }

}
