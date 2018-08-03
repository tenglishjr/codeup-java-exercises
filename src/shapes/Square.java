package shapes;

public class Square extends Quadrilateral implements Measurable {

//    public Square(double side) {
//        super(side, side);
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 4 * getLength();
//    }
//
//    @Override
//    public double getArea() {
//        return Math.pow(getLength(), 2);
//    }

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.length = this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }
}
