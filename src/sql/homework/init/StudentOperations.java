package src.sql.homework.init;

import src.sql.homework.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentOperations {
    public void insertStudent (Student student) throws SQLException, ClassNotFoundException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "INSERT INTO students (name,surname) VALUES (?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1,student.getName());
            preparedStatement.setString(2,student.getSurname());
            preparedStatement.executeUpdate();
        }
    }


    public List<Student> selectAllStudents() throws SQLException, ClassNotFoundException {
        List<Student> students = new ArrayList<>();
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "select * from students";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setSurname(resultSet.getString("surname"));
                students.add(student);
            }
        }
        return students;
    }

}
