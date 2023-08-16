package src.exceptions.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Запросити з консолі число і огорнути цей функціонал у блоки обробки винятків. При вводі замість числа  буков - показувати повідомлення про помилку на консоль.
        //За допомогою нескінченного циклу - запитувати число з консолі - поки не отримаємо його без помилок

        first();

        //Створити виняток який викидається коли число менше нуля. Створити функцію, яка приймає число і повертає його квадрат.Якщо число буде менше нуля - то викинути створений вийняток

        int result = second();
        if (result >= 0) {
            System.out.println("Результат: " + result);
        }
    }

    private static void first() {
        Scanner scanner = new Scanner(System.in);
        int intFromUser;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Введіть число: ");
                intFromUser = scanner.nextInt();
                System.out.println("Число " + intFromUser + " прийнято");
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Необхідно ввести число.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Помилка: " +e.getMessage());
            }
        }
        scanner.close();
    }

    private static int second() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введіть число, щоб отримати його квадрат: ");
            int intFromUser = scanner.nextInt();
            if (intFromUser < 0) {
                throw new CustomException("Введене число < 0");
            }
            return intFromUser*intFromUser;
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Необхідно ввести число");
        }
        return -1;
    }
}