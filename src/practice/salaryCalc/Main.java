package src.practice.salaryCalc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Months month = Months.ЖОВТЕНЬ;
        Scanner scanner = new Scanner(System.in);
        int salaryFromUser = 0;

        if (month.getDaysForAvans() == 0 || month.getDaysForSalary() == 0 || month.getWorkDays() == 0) {
            System.out.println("ERROR. Check month parameters");
        } else {
            System.out.print("Введіть ЗП: ");
            salaryFromUser = scanner.nextInt();
        }
        if (salaryFromUser <= 0) {
            System.out.println("ERROR. Salary can't be 0 or lower");
        } else {
            double salaryAfterTax = salaryFromUser * 80.5 / 100;

            String monthString = String.valueOf(month);

            System.out.println("Місяць: " + monthString.toLowerCase());
            System.out.println("Аванс до видачі: " + (salaryAfterTax / month.getWorkDays()) * month.getDaysForAvans());
            System.out.println("Зарплата до видачі " + (salaryAfterTax / month.getWorkDays()) * month.getDaysForSalary());
        }
    }
}

