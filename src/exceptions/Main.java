package src.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        try {
//            int result = 10/0;
//            System.out.println(result);
//        } catch (ArithmeticException e) {
//            System.out.println("Division by zero error");
//        }

        //System.out.println(toDivide(5,1));
        practiceTwo();

    }

    private static int toDivide (int a, int b) {

        try {
            return a / b;
        } catch (NullPointerException e) {
            System.out.println("Помилка: null значення");
        } catch (ArithmeticException e) {
            System.out.println("Помилка: ділення на нуль");
        }
    return -1;
    }

    private static void practiceTwo() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введіть перше число для ділення: ");
            int a = scanner.nextInt();
            System.out.println("Введіть друге число для ділення: ");
            int b = scanner.nextInt();

            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Не можна ділити на 0");
        } catch (NullPointerException e) {
            System.out.println("Не введено число");
        } catch (InputMismatchException e) {
            System.out.println("Введено не число");
        }
        }
    }
