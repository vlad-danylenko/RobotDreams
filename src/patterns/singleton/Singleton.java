package src.patterns.singleton;

public class Singleton {
    private static final Singleton instance = new Singleton("Vladyslav");

    private Singleton(String name) {
        this.name = name;
    }

    private String name;

    public static Singleton getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "name='" + name + '\'' +
                '}';
    }
}
