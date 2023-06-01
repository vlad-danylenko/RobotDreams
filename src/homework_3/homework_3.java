package src.homework_3;

import java.util.Scanner;

public class homework_3 {
    public static void main(String[] args) {
        Scanner intFromUser = new Scanner(System.in);
        System.out.println("Введіть перше число");
        Integer a = intFromUser.nextInt();
        System.out.println("Введіть друге число");
        Integer b = intFromUser.nextInt();

        System.out.println("Введені числа: " + a + "; " + b);

        System.out.println("Результат додавання: " + (a+b));
        System.out.println("Результат віднімання: " + (a-b));
        System.out.println("Результат ділення: " + (a/b));
        System.out.println("Результат множення: " + (a*b));
    }
}
