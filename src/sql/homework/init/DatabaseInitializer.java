package src.sql.homework.init;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitializer {
    private void initializeDatabase() throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        try (Statement statement = connection.createStatement()) {

            statement.execute(
                    "CREATE TABLE IF NOT EXISTS countries (" +
                            "id INT AUTO_INCREMENT PRIMARY KEY," +
                            "country_name_ua VARCHAR(255) NOT NULL," +
                            "country_name_en VARCHAR(255) NOT NULL" +
                            ")"
            );

            statement.execute(
                    "CREATE TABLE IF NOT EXISTS cities (" +
                            "id INT AUTO_INCREMENT PRIMARY KEY," +
                            "city_name_ua VARCHAR(255) NOT NULL," +
                            "city_name_en VARCHAR(255) NOT NULL," +
                            "capital_country_name_ua VARCHAR(255) NOT NULL," +
                            "FOREIGN KEY (id) REFERENCES countries(id)" +
                            ")"
            );

            statement.execute(
                    "CREATE TABLE IF NOT EXISTS students (" +
                            "id INT AUTO_INCREMENT PRIMARY KEY," +
                            "name VARCHAR(255) NOT NULL," +
                            "surname VARCHAR(255) NOT NULL" +
                            ")"
            );
        }
    }

    public void createDatabase() {
        try {
            initializeDatabase();
            System.out.println("Database and tables created successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
