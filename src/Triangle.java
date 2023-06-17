public class Triangle extends Figures {
    private final double base;
    private final double height;
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double countArea() {
        return (base * height) / 2;
    }

    @Override
    public double countPerimeter() {
        return side1 + side2 + side3;
    }

}
