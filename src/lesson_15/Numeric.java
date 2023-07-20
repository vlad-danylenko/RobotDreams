package src.lesson_15;

public class Numeric <N extends Number> {
    private N value;

    public Numeric(N value) {
        this.value = value;
    }

    public N getValue() {
        return value;
    }


}
