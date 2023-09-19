package src.sql.homework;

import src.sql.homework.init.DatabaseCreationFacade;
import src.sql.homework.init.StudentOperations;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // 1. Встановити Mysql та створити 2 таблиці: місто та країна. додаткові поля підібрати самостійно.
        // Зробити між ними зв'язок один до багатьох.  Заповнити ці таблиці кількома записами.
        DatabaseCreationFacade databaseCreationFacade = new DatabaseCreationFacade();
        databaseCreationFacade.createAndInsertDatabase(false);

        // 2. Створити клас студент і за допомогою джава зберігати інформацію про студента в базі даних та прочитати її.
        Student vlad = new Student(1, "Vladyslav", "Danylenko");
        Student max = new Student(2, "Maxim", "Kovalenko");
        Student oleg = new Student(3, "Oleg", "Kletkin");

        addStudent(vlad);
        addStudent(max);
        addStudent(oleg);

        selectAllStudents();
    }

    private static void addStudent(Student student) throws SQLException, ClassNotFoundException {
        StudentOperations so = new StudentOperations();
        so.insertStudent(student);
    }

    private static void selectAllStudents() throws SQLException, ClassNotFoundException {
        StudentOperations so = new StudentOperations();
        List<Student> students = so.selectAllStudents();
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

    }
}
