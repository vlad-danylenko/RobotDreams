package src.sql.service;

import src.sql.crud.DepartmentManager;
import src.sql.model.Department;

import java.sql.SQLException;

public class DepartmentService {
    private DepartmentManager departmentManager;

    public DepartmentService() {
        this.departmentManager = new DepartmentManager();
    }

    public void createDepartment(Department department) throws SQLException {
        departmentManager.insertDepartment(department);
    }

    public Department getDepartmentById(int id) throws SQLException {
        return departmentManager.findDepartmentById(id);
    }

    public void updateDepartment(Department department) throws SQLException {
        departmentManager.updateDepartment(department);
    }

    public void deleteDepartment(int id) throws SQLException {
        departmentManager.deleteDepartment(id);
    }
}
