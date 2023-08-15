package src.interfaces.homework_14;

public class Pilot extends Human {

    private final String action = "flying";
    public Pilot() {
    }

    @Override
    public void flyInfo() {
        System.out.println("I'm " + action);
    }

    @Override
    void humanInfo() {

    }
}
