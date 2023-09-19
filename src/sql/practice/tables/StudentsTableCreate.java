package src.sql.practice.tables;

import src.sql.practice.DBConnection.DBConnect;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentsTableCreate {
    private void tableCreation() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnect.getInstance().getConnection();

        try (Statement statement = connection.createStatement()) {
            statement.execute(
                    "CREATE TABLE IF NOT EXISTS robot_dreams.students (" +
                            "id INT AUTO_INCREMENT PRIMARY KEY," +
                            "name VARCHAR(255) NOT NULL" +
                            ")"
            );
            }
        }

        public void createTable() {
        try {
            tableCreation();
            System.out.println("Table successfully created");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        }
    }
