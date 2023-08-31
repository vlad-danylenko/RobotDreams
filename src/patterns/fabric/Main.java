package src.patterns.fabric;

public class Main {
    public static void main(String[] args) {
        Creator creator = new SomeCreator();
        Product product = creator.factoryMethod();

        product.create();
    }
}
