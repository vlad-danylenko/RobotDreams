package src.sql.practice.DBConnection;

import src.sql.init.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    private static volatile DBConnect instance;
    private Connection connection;

    private DBConnect() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String user = "root";
        String password = "123456789";
        String base_url = "jdbc:mysql://localhost:3306/";
        String dbName = "robot_dreams";
        String url = base_url + dbName;

        try {
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static DBConnect getInstance() throws SQLException, ClassNotFoundException {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DBConnect();
                }
            }
        } else if (instance.getConnection().isClosed()) {
            synchronized (DatabaseConnection.class) {
                if (instance == null || instance.getConnection().isClosed()) {
                    instance = new DBConnect();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
