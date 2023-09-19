package src.sql.homework.init;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CountryCreator {
    private void createCountries() throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "INSERT INTO countries (country_name_ua,country_name_en) VALUES (?,?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, "Україна");
            preparedStatement.setString(2, "Ukraine");
            preparedStatement.addBatch();

            preparedStatement.setString(1, "Польща");
            preparedStatement.setString(2, "Poland");
            preparedStatement.addBatch();

            preparedStatement.setString(1, "Німеччина");
            preparedStatement.setString(2, "Germany");
            preparedStatement.addBatch();
            preparedStatement.executeBatch();

        }
    }

    public void initialization() {
        try {
            createCountries();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
