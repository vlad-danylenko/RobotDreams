package src.sql.practice.tables;

import src.sql.practice.DBConnection.DBConnect;
import src.sql.practice.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentCrud {

    public void insertStudent (Student student) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnect.getInstance().getConnection();

        String sql = "INSERT INTO students (name) VALUES (?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1,student.getName());
            preparedStatement.executeUpdate();
        }
    }

    public Student findStudentById(int studentId) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnect.getInstance().getConnection();

        String sql = "SELECT * FROM students WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, studentId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                return student;
            }
        }
        return null; // повертаємо null, якщо департамент не знайдено
    }

    public List<Student> selectAllStudents() throws SQLException, ClassNotFoundException {
        List<Student> students = new ArrayList<>();
        Connection connection = DBConnect.getInstance().getConnection();

        String sql = "select * from students";
        try (Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                students.add(student);
            }
        }
        return students;
    }


}
