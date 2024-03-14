package src.practice.tests;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Hive {
    public static void main(String[] args) {
        // Змінні для підключення до Hive
        String jdbcURL = "jdbc:hive2://ks-dmp01.kyivstar.ua:2181,ks-dmp02.kyivstar.ua:2181,ks-dmp03.kyivstar.ua:2181,ks-dmp12.kyivstar.ua:2181,ks-dmp13.kyivstar.ua:2181/;serviceDiscoveryMode=zooKeeper;zooKeeperNamespace=hiveserver2";
        String username = "vladislav.danylenko";
        String password = "4126709VlAd38";

        // Завантаження драйвера JDBC Hive
        try {
            Class.forName("org.apache.hive.jdbc.HiveDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Не вдалося завантажити драйвер Hive JDBC");
            e.printStackTrace();
            System.exit(1);
        }

        // Підключення до Hive
        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password);
             Statement statement = connection.createStatement()) {

            // Ваш SQL-запит
            String query = "SELECT * FROM other_sources.rtn_callback_api_events" +
                    "where hday='2023-11-27' limit 5";
            ResultSet resultSet = statement.executeQuery(query);

            // Обробка результатів
            while (resultSet.next()) {
                // Опрацьовуйте дані рядка за допомогою resultSet.getXXX() методів
                resultSet.getString("trigger_id");
                resultSet.getString("msisdn");
            }

        } catch (SQLException e) {
            System.out.println("Помилка при роботі з Hive через JDBC");
            e.printStackTrace();
        }
    }
}
