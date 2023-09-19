package src.sql.homework.init;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CityCreator {
    private void createCities() throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "INSERT INTO cities (id,city_name_ua, city_name_en, capital_country_name_ua) VALUES (?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "Київ");
            preparedStatement.setString(3, "Kyiv");
            preparedStatement.setString(4, "Україна");
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Варшава");
            preparedStatement.setString(3, "Warsaw");
            preparedStatement.setString(4, "Польща");
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 3);
            preparedStatement.setString(2, "Берлін");
            preparedStatement.setString(3, "Berlin");
            preparedStatement.setString(4, "Німеччина");
            preparedStatement.addBatch();

            preparedStatement.executeBatch();

        }
    }

    public void initialization() {
        try {
            createCities();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
