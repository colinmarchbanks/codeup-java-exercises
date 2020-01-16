package shapes;

public class Square extends Quadrilateral implements Measurable {

    public Square(double side) {
        super(side, side);
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
        System.out.println("Square Perimeter");
        return 4*length;
    }

    @Override
    public double getArea() {
        System.out.println("Square Area");
        return width*width;
    }
}
