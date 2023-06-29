package src.lesson_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class lesson_8 {

    private final static int range = 100;

    public static void main(String[] args) {
        Random random = new Random();

        /*int[] myArray = new int[10];

        for (int i=0; i< myArray.length;i++) {
            myArray[i] = random.nextInt(range);
        }

        System.out.println(Arrays.toString(myArray));
        System.out.println(myArray[9]);

        int[] arrayUser = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrayUser.length; i++) {
            System.out.println("Введіть " + (i+1) + " число: ");
            int intFromUser = scanner.nextInt();
            arrayUser[i] = intFromUser;
        }

        System.out.println(Arrays.toString(arrayUser));
*/

        String[][] second = new String[3][5];
        for (int i = 0; i < second.length; i++) {
            for (int j = 0; j < second[i].length; j++) {
                second[i][j] = String.valueOf(j);
            }
        }

        System.out.println("Second");
        System.out.println(Arrays.deepToString(second));
        System.out.println("Another view");
        System.out.println("{");
        for (int i = 0; i < second.length; i++) {
            System.out.print("{");
            for (int j = 0; j < second[i].length; j++) {
                if (j + 1 == second[i].length) {
                    System.out.print(second[i][j]);
                } else {
                    System.out.print(String.valueOf(second[i][j].concat(",")));
                }
            }
            System.out.println("}");
        }
        System.out.println("}");


        int[] arraySort = new int[5];
        for (int i = 0; i < arraySort.length; i++) {
            arraySort[i] = random.nextInt(range);
        }

        System.out.println("Оригінальний масив: " + Arrays.toString(arraySort));
        Arrays.sort(arraySort);
        System.out.println("Відсотрований масив: " + Arrays.toString(arraySort));

        System.out.println("Виведення масиву циклом: ");
        for (int i = 0; i < arraySort.length; i++) {
            if (i + 1 == arraySort.length) {
                System.out.println(arraySort[i]);
            } else {
                System.out.print(arraySort[i] + ", ");
            }
        }


        int sum = 0;
        for (int i = 0; i < arraySort.length; i++) {
            sum += arraySort[i];
        }
        System.out.println("Сума елементів в масиві: " + sum);
        double avg = (double) sum / arraySort.length;
        System.out.println("Середнє значення: " + avg);


    }
}
