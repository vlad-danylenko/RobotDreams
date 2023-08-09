package src.streamapi1.homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Danylenko", 9.2));
        students.add(new Student("Kuzmenko", 6));
        students.add(new Student("Bondar", 9));
        students.add(new Student("Lutonina", 8.5));


        System.out.println("Original:");
        students.forEach(System.out::println);

        List<Student> sortedBySurname = students.stream()
                .sorted(Comparator.comparing(Student::getSurname))
                .toList();

        System.out.println("\nSorted by surname:");
        sortedBySurname.forEach(System.out::println);

        List<Student> sortedByAvgScore = students.stream()
                .sorted(Comparator.comparingDouble(Student::getAvgScore))
                .toList();

        System.out.println("\nSorted by average score:");
        sortedByAvgScore.forEach(System.out::println);

    }
}
