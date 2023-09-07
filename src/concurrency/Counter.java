package src.concurrency;

public class Counter {

    private int count = 0;
   /* public void increment() {
        count++;
    }*/

    public void increment() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
