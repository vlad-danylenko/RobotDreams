package src.sql;

import src.sql.fetcher.UserWithDepartmentFetcher;
import src.sql.init.DatabaseCreationFacade;
import src.sql.model.Department;
import src.sql.model.User;
import src.sql.service.DepartmentService;
import src.sql.service.UserService;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DatabaseCreationFacade databaseCreationFacade = new DatabaseCreationFacade();
        //after first run -> make it false, to create database -> true
        databaseCreationFacade.createAndInsertDatabase(false);

        UserWithDepartmentFetcher userWithDepartmentFetcher = new UserWithDepartmentFetcher();
        try {
            List<User> userList = userWithDepartmentFetcher.fetchUsersWithDepartments();
            System.out.println(userList);
            UserService userService = new UserService();
            User user = userService.getUserById(1);
            System.out.println(user);
            DepartmentService departmentService = new DepartmentService();
            Department department = departmentService.getDepartmentById(1);
            System.out.println(department);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    }

