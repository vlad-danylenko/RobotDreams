package src.interfaces.homework_14;

public class Driver extends Human {

    private final String action = "driving";

    public Driver() {
    }

    @Override
    void humanInfo() {

    }

    @Override
    public void driveInfo() {
        System.out.println("I'm " + action);
    }
}
