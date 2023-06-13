package src.lesson_5;

import java.util.Scanner;

public class dayOfWeek_hw5 {
    public static void main(String[] args) {
        // Написати програму, що конвертує числа від 1 до 7 в дні тижня.

        //Варіант №1
       System.out.println("Програма, що конвертує числа в дні тижня. Введіть число від 1 до 7");
        Scanner dataFromUser = new Scanner(System.in);
        int day = dataFromUser.nextInt();
        System.out.println(dayOfWeek(day));
    }

    public static String dayOfWeek (int day) {
        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Введіть число від 1 до 7";
        };
        return result;
    }
/*
        // Варіант №2
        for (int i = 1; i <= 7; i++) {
            System.out.println(dayOfWeek(i));
        }
    }

    public static String dayOfWeek(int day) {
        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Введіть число від 1 до 7";
        };
        return result;
    }*/
}
