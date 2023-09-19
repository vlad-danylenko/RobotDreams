package src.sql.practice;

import src.sql.practice.tables.StudentCrud;
import src.sql.practice.tables.StudentsTableCreate;

import java.sql.SQLException;
import java.util.List;

public class JDBC {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        StudentsTableCreate studentsTableCreate = new StudentsTableCreate();
        studentsTableCreate.createTable();

        Student mykola = new Student(1,"Mykola");
        Student oleg = new Student(2,"Oleg");
        Student vlad = new Student(3,"Vladyslav");
        Student anton = new Student(4,"Anton");

        /*addStudent(mykola);
        addStudent(oleg);
        addStudent(vlad);
        addStudent(anton);*/

        //findStudentById(4);

        selectAllStudents();
    }

    private static void addStudent(Student student) throws SQLException, ClassNotFoundException {
        StudentCrud studentCrud = new StudentCrud();
        studentCrud.insertStudent(student);
    }

    private static void findStudentById (int studentID) throws SQLException, ClassNotFoundException {
        StudentCrud studentCrud = new StudentCrud();
        Student foundStudent = studentCrud.findStudentById(studentID);
        if (foundStudent == null) {
            System.out.println("Student with provided ID wasn't found");
        } else {
            System.out.println("Found student " + foundStudent.getName() + " with ID: " + foundStudent.getId());
        }
    }

    private static void selectAllStudents() throws SQLException, ClassNotFoundException {
        StudentCrud studentCrud = new StudentCrud();
        List<Student> students = studentCrud.selectAllStudents();
        for (int i = 0; i<students.size(); i++) {
            System.out.println(students.get(i));
        }

    }
}
