package src.concurrency.homework2;

import java.util.Random;
import java.util.concurrent.*;

public class Main {
    private final static int minRange = 1;
    private static int maxRange = 10;

    public static void main(String[] args) {
        /* Створити поток який генерує числа від 1 до 10 і нескінченно їх виводить на консоль.
        Якщо згенероване число == 5 - то перервати роботу потоку */
        firstTask();

        /* Створити callable поток, який повертає випадково згенероване число від 1 до 50.
        Зробити пул с 10 потоків для виклику цього методу */
        secondTask();

    }

    public static void firstTask() {
        Thread thread1 = new Thread(() -> {
            Random random = new Random();
            boolean isActive = true;
            while (isActive) {
                int randomResult = (random.nextInt(maxRange - minRange + 1) + minRange);
                System.out.println(randomResult);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (randomResult == 5) {
                    isActive = false;
                }
            }
            System.out.println("Thread stopped");
        });

        thread1.start();
    }

    public static void secondTask() {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        Callable<Integer> returnRandomInt = () -> {
            Random random = new Random();
            maxRange = 50;
            return (random.nextInt(maxRange - minRange + 1) + minRange);
        };

        try {
            Future<Integer> future = executor.submit(returnRandomInt);
            Integer result = future.get();
            System.out.println("Random number: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
