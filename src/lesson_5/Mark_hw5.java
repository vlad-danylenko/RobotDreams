package src.lesson_5;

import java.util.Scanner;

public class Mark_hw5 {
    public static void main(String[] args) {
        //Написати програму, що приймає оцінку (від A до F) та виводить повне значення оцінки
        Scanner reader = new Scanner(System.in);
        System.out.println("Введіть букву від A до F для отримання повної назви оцінки");
        char markFromUser = reader.next().charAt(0);
        markDesc(markFromUser);

    }
        private static void markDesc (char markFromUser) {
        switch (markFromUser) {
            case 'A', 'a' -> System.out.println("Excellent");
            case 'B', 'b' -> System.out.println("Good");
            case 'C', 'c' -> System.out.println("Average");
            case 'D', 'd' -> System.out.println("Below Average");
            case 'F', 'f' -> System.out.println("Fail");
            default -> System.out.println("Необіхдно ввести букву від A до F");
        }
    }
}

