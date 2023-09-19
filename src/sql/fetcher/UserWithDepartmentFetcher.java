package src.sql.fetcher;

import src.sql.init.DatabaseConnection;
import src.sql.model.Department;
import src.sql.model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserWithDepartmentFetcher {
    public List<User> fetchUsersWithDepartments() throws SQLException {
        List<User> users = new ArrayList<>();

        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "SELECT u.id as user_id, u.name as user_name, u.surname, d.id as department_id, d.name as department_name " +
                "FROM users u " +
                "JOIN departments d ON u.department_id = d.id";

        /*
        Statement - це інтерфейс в JDBC, який дозволяє вам виконувати SQL-запити до бази даних.
         */
        try (Statement statement = connection.createStatement();
             /*
             ResultSet - це об'єкт, який містить результати SQL-запиту.
             Ви можете перебирати результати за допомогою методу next() та
             отримувати значення за допомогою методів, таких як getString(), getInt() тощо.
              */
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                Department department = new Department();
                department.setId(resultSet.getInt("department_id"));
                department.setName(resultSet.getString("department_name"));

                User user = new User();
                user.setId(resultSet.getInt("user_id"));
                user.setName(resultSet.getString("user_name"));
                user.setSurname(resultSet.getString("surname"));
                user.setDepartment(department);

                users.add(user);
            }
        }

        return users;
    }
}
