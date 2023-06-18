package src.lesson_7;

import java.util.Scanner;

public class homework_7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 1
        System.out.println("1. Програма для виведення куба заданого числа.");
        System.out.print("Ввеедіть число: ");
        int intFromUser = scan.nextInt();
        System.out.println("Результат: " + cubeCalc(intFromUser));

        // 2
        System.out.println("\n2. Метод повинен вивести зірочку стільки разів, скільки передав користувач у метод");
        System.out.print("Напишіть числом, скільки * треба вивести на екран: ");
        int starsFromUser = scan.nextInt();
        starsCount(starsFromUser);

        // 3
        System.out.println("\n3. Метод повинен вивести переданий символ стільки разів, скільки передав користувач у метод");
        System.out.print("Введіть символ: ");
        char symbol = scan.next().charAt(0);
        System.out.print("Напишіть числом, скільки разів вивести на екран символ " + symbol + " : ");
        int countFromUser = scan.nextInt();
        repeatSymbol(symbol, countFromUser);

    }

    private static int cubeCalc (int intFromUser) {
        int r = 1;
        for (int i = 1; i <= 3; i++) {
            r = r * intFromUser;
        } return r;
    }

    private static void starsCount (int starsFromUser) {
        for (int i = 0; i < starsFromUser; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void repeatSymbol (char symbol, int countFromUser) {
        for (int i = 0; i < countFromUser; i++) {
            System.out.print(symbol);
        }
    }
}
