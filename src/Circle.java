public class Circle extends Figures {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double countArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double countPerimeter(){
        return 2* Math.PI * radius;
    }
}

