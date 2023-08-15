package src.collections1.homework_17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Створити програму для збереження списку чисел з 10 елементів та іншого з 2 000 000 елементів. Для кожного підібрати свій тип
        LinkedList <Integer> linkArray = new LinkedList<>();
        ArrayList <Integer> intArray = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            linkArray.add(i);
        }

        for (int i = 0; i < 2000000; i++) {
            intArray.add(i);
        }

        // 2. Зберегти у колекції список студентів (класс Студент теж створити)
        Student student1 = new Student("Vladyslav", "Danylenko", 26);
        Student student2 = new Student("Alona", "Bondar", 28);
        Student student3 = new Student("Valeriya", "Lutonina", 30);
        List <Student> studentsList = new ArrayList<>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);

        // 3. Вивести цей список
        System.out.println(studentsList);


    }
}
