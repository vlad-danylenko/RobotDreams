package src.sql.init;

public class DatabaseCreationFacade {
    private final DatabaseInitializer databaseInitializer;
    private final DepartmentCreator departmentCreator;
    private final UserCreator userCreator;

    public DatabaseCreationFacade() {
        this.databaseInitializer = new DatabaseInitializer();
        this.departmentCreator = new DepartmentCreator();
        this.userCreator = new UserCreator();
    }

    public void createAndInsertDatabase(boolean create) {
        if(create) {
            databaseInitializer.createDatabase();
            departmentCreator.initialization();
            userCreator.initialization();
        }
    }
}
