package src.practice.toString;

public class Event {
    private int d;
    private int m;
    private int y;
    private String eventName;


    public Event (int d, int m, int y, String eventName) {
        this.d = d;
        this.m = m;
        this.y = y;
        this.eventName = eventName;
    }

    @Override
    public String toString() {
        return d + "/" + m + "/" + y + " - " + eventName;
    }


}
