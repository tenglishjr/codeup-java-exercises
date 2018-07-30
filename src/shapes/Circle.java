package shapes;

public class Circle {

    private double radius;
    private static int noOfCircles;

    public Circle() {
        this.radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow((Math.PI * radius), 2);
    }

    public double getCircumference() {
        return 2 * (Math.PI * radius);
    }

    public void countCircles() {
        noOfCircles++;
        System.out.println("Current amount of circles created: " + noOfCircles);
    }

}
