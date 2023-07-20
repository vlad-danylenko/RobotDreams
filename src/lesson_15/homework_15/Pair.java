package src.lesson_15.homework_15;

public class Pair <P> {

    private P first;
    private P second;

    public Pair(P first, P second) {
        this.first = first;
        this.second = second;
    }

    public P getFirst() {
        return first;
    }

    public P getSecond() {
        return second;
    }
}
