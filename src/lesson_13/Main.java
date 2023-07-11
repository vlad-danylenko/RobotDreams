package src.lesson_13;

public class Main {
    public static void main(String[] args) {
        GeometricShape circle = new Circle(5);
        GeometricShape rectangle = new Rectangle(10,10);

        circle.calculateArea();
        circle.calculatePerimeter();

        rectangle.calculateArea();
        rectangle.calculatePerimeter();

    }
}
