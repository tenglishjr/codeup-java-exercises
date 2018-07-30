package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input userInput = new Input();

        do {
            Circle circle = new Circle(userInput.getInt("Specify the circle radius..."));

            System.out.println("The area of this circle is " + circle.getArea() + " units sq");
            System.out.println("The circumference of this circle is " + circle.getCircumference() + " units");

            circle.countCircles();
        } while (userInput.yesNo("Do you wish to add another circle?"));

    }

}
