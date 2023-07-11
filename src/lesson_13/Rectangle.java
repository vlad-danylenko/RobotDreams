package src.lesson_13;

public class Rectangle implements GeometricShape {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println(height*width);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(2*(height+width));
    }
}
