package src.streamapi2.practice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
/*
        Завдання 1: Вибір студентів за середнім балом
        Завдання:
        Необхідно вибрати зі списку студентів тих,
        хто має середній бал вище певного порогу,
        відсортувати їх за прізвищем і повернути перші 5 студентів у вигляді списку імен.
         */
        List<Student> students = List.of(
                new Student("Artur", "Cherniak", List.of(8,10,9)),
                new Student("Andrii", "AndriiCherniak", List.of(5,6,7)),
                new Student("Serhii", "SerhiiCherniak", List.of(8,10,9)),
                new Student("Vlad", "VladCherniak", List.of(8,10,9)),
                new Student("Oleksii", "OleksiiCherniak", List.of(5,6,7)),
                new Student("Max", "MaxCherniak", List.of(8,10,9)),
                new Student("Volodumur", "VolodumurCherniak", List.of(8,10,9)),
                new Student("Ihor", "IhorCherniak", List.of(5,6,7))
        );
        double threshold = 6.7;
        System.out.println(topStudents(students, threshold));

         /*
        Завдання 2: Групування студентів за факультетами
        Завдання:
        Необхідно згрупувати студентів за факультетами, відсортувати їх в кожній групі за середнім балом
        у спадаючому порядку і взяти перші 3 студента з кожного факультету.
         */
        List<Student> studentsSecond = List.of(
                new Student("Artur", "Cherniak", List.of(8,10,9), "Math"),
                new Student("Andrii", "AndriiCherniak", List.of(5,6,7), "Math"),
                new Student("Serhii", "SerhiiCherniak", List.of(8,10,9), "Biology"),
                new Student("Vlad", "VladCherniak", List.of(8,10,9),"Biology"),
                new Student("Oleksii", "OleksiiCherniak", List.of(5,6,7), "Math"),
                new Student("Max", "MaxCherniak", List.of(8,10,9), "Physic"),
                new Student("Volodumur", "VolodumurCherniak", List.of(8,10,9), "Physic"),
                new Student("Ihor", "IhorCherniak", List.of(5,6,7), "Physic")
        );

        System.out.println(groupByFacultyTop3(studentsSecond));
    }

    public static List<String> topStudents(List<Student> students, double threshold) {
        return  students.stream()
                .filter(student -> student.getAverageScore() > threshold)
                .sorted(Comparator.comparing(Student::getSurname))
                .limit(5)
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    public static Map<String, List<Student>> groupByFacultyTop3(List<Student> students) {

        return students.stream()
                .collect(
                        Collectors.groupingBy(Student::getFacultet, Collectors.collectingAndThen(
                                Collectors.toList(), list -> list.stream()
                                        .sorted(Comparator.comparing(Student::getAverageScore).reversed())
                                        .limit(3)
                                        .toList()
                        )
                        )
                );
    }
}
