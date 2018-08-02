package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Quadrilateral(double side) {
        this.length = side;
        this.width = side;
    }

    public Quadrilateral(){}

    public double getLength() {
        return this.length;
    }

    public abstract void setLength(double length);

    public double getWidth() {
        return this.width;
    }

    public abstract void setWidth(double width);

    @Override
    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}
