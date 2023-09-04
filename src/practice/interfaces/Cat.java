package src.practice.interfaces;

public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void color() {
        System.out.println("Dark green");
    }
}
