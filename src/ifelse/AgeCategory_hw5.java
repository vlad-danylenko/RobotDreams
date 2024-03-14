package src.ifelse;

import java.util.Scanner;

public class AgeCategory_hw5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Програма, що визначає категорію віку");
        System.out.println("Введіть вік від 0 до 100");
        int ageFromUser = reader.nextInt();

        if (ageFromUser >= 0 && ageFromUser < 13 ) {
            System.out.println("Дитина");
        } else if (ageFromUser >= 13 && ageFromUser < 18) {
            System.out.println("Підліток");
        } else if (ageFromUser >= 18 && ageFromUser < 51) {
            System.out.println("Дорослий");
        } else if (ageFromUser >= 51 && ageFromUser <= 100) {
            System.out.println("Літній");
        } else {
            System.out.println("Введіть цифру від 0 до 100");
        }
    }
}
