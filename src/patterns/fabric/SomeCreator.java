package src.patterns.fabric;

public class SomeCreator extends Creator {
    @Override
    public Product factoryMethod() {
        return new SomeProduct();
    }


}
