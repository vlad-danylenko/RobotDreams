package src.streamapi1.homework;

import java.util.Objects;

public class Student {
    private String surname;
    private double avgScore;

    public Student(String surname, double avgScore) {
        this.surname = surname;
        this.avgScore = avgScore;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "Student: " +
                "surname='" + surname + '\'' +
                ", avgScore=" + avgScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.avgScore, avgScore) == 0 && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, avgScore);
    }
}
