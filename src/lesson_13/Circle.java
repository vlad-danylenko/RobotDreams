package src.lesson_13;

public class Circle implements GeometricShape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println(3.14 * (radius*radius));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(2 * 3.14 * radius);

    }
}
