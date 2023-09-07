package src.concurrency;

public class Main {
    public static void main(String[] args) throws InterruptedException {
/*        MyThread thread = new MyThread(0);
        MyThread thread1 = new MyThread(1);
        MyThread thread2 = new MyThread(2);
        MyThread thread3 = new MyThread(3);
        MyThread thread4 = new MyThread(4);
        MyThread thread5 = new MyThread(5);
        MyThread thread6 = new MyThread(6);

        runThreads(thread,thread1,thread2,thread3,thread4,thread5,thread6);*/

        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final count: " + counter.getCount());

    }

    private static void runThreads(Thread ... threads) {
        for (Thread thread: threads) {
            thread.start();
        }
    }
}
