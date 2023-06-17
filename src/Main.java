// The first Java Lesson

public class Main {
    public static void main(String[] args) {
        Figures[] figure = new Figures[5];
        figure[0] = new Triangle(2, 4, 3, 5, 4);
        figure[1] = new Rectangle(3, 4);
        figure[2] = new Circle(5);
        figure[3] = new Rectangle(5, 7);
        figure[4] = new Circle(6);
        double totalPerimeter = 0;
        for (Figures figures : figure) {
            totalPerimeter += figures.countPerimeter();
        }

        System.out.println("The total perimeter of all the figures is:" + totalPerimeter);
    }
}


