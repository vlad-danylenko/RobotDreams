package src.patterns.proxy;

public class Proxy implements Car {

    Car car = new Audi();

    @Override
    public void drive() {
        System.out.println("Proxy functional");
        car.drive();
    }
}
