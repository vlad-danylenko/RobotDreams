package src.lesson_7;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введіть перше число");
        int number1 = reader.nextInt();
        System.out.println("Введіть друге число");
        int number2 = reader.nextInt();
        System.out.println("Напишіть цифрою яку операцію необхідно виконати? \n1 - Відняти\n2 - Додати\n3 - Помжножити\n4 - Поділити");
        int operationFromUser = reader.nextInt();


        System.out.println("Результат: " + defineOperation(number1,number2,operationFromUser));

    }


    private static int defineOperation (int number1, int number2, int operationFromUser) {
        int result = switch (operationFromUser) {
            case 1 -> minus(number1,number2);
            case 2 -> plus(number1,number2);
            case 3 -> multiply(number1,number2);
            case 4 -> divide(number1,number2);
            default -> throw new IllegalStateException("Unexpected value: " + operationFromUser);
        }; return result;
    }
    private static int minus (int number1, int number2) {
        return number1-number2;
    }

    private static int plus (int number1, int number2) {
        return number1+number2;
    }

    private static int multiply (int number1, int number2) {
        return number1*number2;
    }

    private static int divide (int number1, int number2) {
        return number1/number2;
    }
}
