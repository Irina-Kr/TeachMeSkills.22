public  class Rectangle extends Figures {
    private final double width;
    private final double height1;

    public Rectangle(double width, double height1) {
        this.width = width;
        this.height1 = height1;

    }

    @Override
    public double countArea() {
        return width * height1;
    }

    @Override
    public double countPerimeter() {
        return 2 * (width + height1);
    }
}

