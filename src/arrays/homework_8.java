package src.arrays;

import java.util.Arrays;
import java.util.Random;

public class homework_8 {

    private final static int range = 100;
    public static void main(String[] args) {
        Random random = new Random();

        // 1. Створення масиву з наповненням рандомними числами
        int[] myArray = new int[10];
        for (int i = 0; i<myArray.length; i++) {
            myArray[i] = random.nextInt(range);
        }
        // 2. Вивід масиву в консоль
        System.out.println("Масив: " + Arrays.toString(myArray));

        // 3-4. Пошук мінімального та максимального значення в масиві
        int min = myArray[0];
        int max = myArray[0];

        int sumArray = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
            if (myArray[i] > max) {
                max = myArray[i];
            }
            sumArray += myArray[i]; // 6. Знайти суму всіх елементів
        }

        double averageArray = (double) sumArray / myArray.length; // 5. Знайти середнє значення

        System.out.println("Мінімальне значення: " + min);
        System.out.println("Максимальне значення: " + max);

        System.out.println("Сума всіх елементів: " +sumArray);
        System.out.println("Середнє значення: " +averageArray);

    }
}
