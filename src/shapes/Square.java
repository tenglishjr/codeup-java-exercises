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
        super(side);
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return Math.pow(this.length, 2);
    }
}
