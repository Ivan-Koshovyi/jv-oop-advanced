package core.basesyntax;

public class Square extends Figure {
    private double side;
    private double area;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void paint() {
        System.out.println("Figure: square, area: "
                + getArea() + " sq. units, side: "
                + side + " units, color: "
                + getColor());
    }
}
