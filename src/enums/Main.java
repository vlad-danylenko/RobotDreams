package src.enums;

public class Main {
    public static void main(String[] args) {
        WeekDays day = WeekDays.WEDNESDAY;
        WeekDays day1 = WeekDays.SATURDAY;

        System.out.println(day.compareTo(day1));
    }
}
