package src.interfaces;

public class Rectangle implements GeometricShape {
    private final int height;
    private final int width;

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
