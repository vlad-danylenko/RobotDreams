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

        System.out.println("Результат: ");
        defineOperation(number1,number2,operationFromUser);
    }


    private static void defineOperation (int number1, int number2, int operationFromUser) {
        switch (operationFromUser) {
            case 1 -> System.out.println(minus(number1,number2));
            case 2 -> System.out.println(plus(number1,number2));
            case 3 -> System.out.println(multiply(number1,number2));
            case 4 -> System.out.println(divide(number1,number2));
        };
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
