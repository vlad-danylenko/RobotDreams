package src.streamapi2.practice;

import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private List<Integer> grades;

    private String facultet;

    public Student(String name, String surname, List<Integer> grades) {
        this.name = name;
        this.surname = surname;
        this.grades = grades;
    }

    public Student(String name, String surname, List<Integer> grades, String facultet) {
        this.name = name;
        this.surname = surname;
        this.grades = grades;
        this.facultet = facultet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public double getAverageScore() {
        return this.grades.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        if (!Objects.equals(name, student.name)) return false;
        if (!Objects.equals(surname, student.surname)) return false;
        if (!Objects.equals(grades, student.grades)) return false;
        return Objects.equals(facultet, student.facultet);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (grades != null ? grades.hashCode() : 0);
        result = 31 * result + (facultet != null ? facultet.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grades=" + grades +
                ", facultet='" + facultet + '\'' +
                '}';
    }
}