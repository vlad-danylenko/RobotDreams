package src.patterns.proxy;

public class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("Audi drives");
    }
}
