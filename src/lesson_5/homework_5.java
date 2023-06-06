package src.lesson_5;

import java.util.Scanner;

public class homework_5 {
    public static void main(String[] args) {
        Scanner dataFromUser = new Scanner(System.in);
        System.out.println("За допомогою програми, можна знайти більше/менше число або перевірити число на парність");
        System.out.println("Напишіть цифру операції, яку необіхдно виконати: \n1 - Знайти більше число\n2 - Знайти менше число\n3 - Перевірити число на парність");
        int operationFromUser = dataFromUser.nextInt();
        switch (operationFromUser) {
            case 1,2 -> greaterOrLower(operationFromUser);
            case 3 -> evenNumber();
            default -> System.out.println("Напишіть число, що відповідає операції");
        }
    }

    private static void greaterOrLower (int operationFromUser) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введіть перше число");
        int first = reader.nextInt();
        System.out.println("Введіть друге число");
        int second = reader.nextInt();
        switch (operationFromUser) {
            case 1 -> findGreaterValue(first, second);
            case 2 -> findLowerValue(first, second);
        }
    }

    // метод знаходження більшого числа
    private static void findGreaterValue(int first, int second) {
        if (first > second) {
            System.out.println("Число " + first + " більше, ніж " + second);
        } else if (first < second) {
            System.out.println("Число " + second + " більше, ніж " + first);
        } else {
            System.out.println("Числа рівні");
        }
    }
    // метод знаходження меншого числа
    private static void findLowerValue(int first, int second) {
        if (first < second) {
            System.out.println("Число " + first + " менше, ніж " + second);
        } else if (first > second) {
            System.out.println("Число " + second + " менше, ніж " + first);
        } else {
            System.out.println("Числа рівні");
        }
    }

    // перевірка на парність
    private static void evenNumber() {
        Scanner dataFromUser = new Scanner(System.in);
        System.out.println("Введіть число");
        int first = dataFromUser.nextInt();

        System.out.println(first % 2 == 0 ? "Число " + first + " парне" : "Число " + first + " непарне");
    }


}

