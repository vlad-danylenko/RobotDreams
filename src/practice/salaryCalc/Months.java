package src.practice.salaryCalc;

public enum Months {

    СІЧЕНЬ(0, 0, 0),
    ЛЮТИЙ(0, 0, 0),
    БЕРЕЗЕНЬ(0, 0, 0),
    КВІТЕНЬ(0, 0, 0),
    ТРАВЕНЬ(0, 0, 0),
    ЧЕРВЕНЬ(22, 11, 11),
    ЛИПЕНЬ(20, 10, 10),
    СЕРПЕНЬ(23, 12, 11),
    ВЕРЕСЕНЬ(21, 11, 10),
    ЖОВТЕНЬ(22, 10, 12),
    ЛИСТОПАД(22, 11, 11),
    ГРУДЕНЬ(21, 11, 10);

private final int workDays;
private final int daysForAvans;
private final int daysForSalary;


    Months(int workDays, int daysForAvans, int daysForSalary) {
        this.workDays = workDays;
        this.daysForAvans = daysForAvans;
        this.daysForSalary = daysForSalary;
    }

    public int getWorkDays() {
        return workDays;
    }

    public int getDaysForAvans() {
        return daysForAvans;
    }

    public int getDaysForSalary() {
        return daysForSalary;
    }

}
