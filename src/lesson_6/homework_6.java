package src.lesson_6;

import java.util.Scanner;

public class homework_6 {
    public static void main(String[] args) {
        // Створити програму для виведення чисел від 1 до 10
        task1();

        // Показати всі парні числа в діапазоні від 1 до 100
        task2();

        // Знайти факторіал числа 7
        task3();

        // Вивести числа фібоначчі до 100 (значення самого числа не повинно перевищувати 100)
        task4();


    }

    private static void task1 () {
        System.out.println("1. Програма для виведення чисел від 1 до 10:");
        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }
    }

    private static void task2 () {
        System.out.println("\n2. Показати всі парні числа в діапазоні від 1 до 100:");
        for (int i=1; i<=100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void task3 () {
        System.out.println("\n3. Програма для пошуку факторіалу");
        Scanner reader = new Scanner(System.in);
        System.out.println("Введіть число");
        int num = reader.nextInt();
        int i = 1;
        int fact = 1;

        do {
            fact = fact * i;
            i++;
        } while (i <= num);
        System.out.println("Факторіал числа " + num + ": " + fact);

    }

    private static void task4 () {
        System.out.println("\n4. Програма для виведення числа фібоначчі (до 100)");
        int n1 = 0, n2 = 1, n3 = 0;
        while (n3 <= 100) {
            System.out.println(n3);
            n3 = n1 +n2;
            n1 = n2;
            n2 = n3;
        }
    }


}
