package src.sql.homework2.init;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class DatabaseInitializer {
    private void initializeDatabase() throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        try (Statement statement = connection.createStatement()) {

            statement.execute(
                    "CREATE TABLE IF NOT EXISTS diary (" +
                            "id int AUTO_INCREMENT PRIMARY KEY," +
                            "note VARCHAR(255) NOT NULL," +
                            "author VARCHAR(255) NOT NULL," +
                            "date VARCHAR(255) NOT NULL" +
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
