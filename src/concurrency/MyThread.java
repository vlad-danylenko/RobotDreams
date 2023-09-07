package src.concurrency;

public class MyThread extends Thread {

    private final int threadCount;

    public MyThread(int threadCount) {
        this.threadCount = threadCount;
    }

    @Override
    public void run() {
        System.out.println("Thread started " + threadCount);
    }
}
