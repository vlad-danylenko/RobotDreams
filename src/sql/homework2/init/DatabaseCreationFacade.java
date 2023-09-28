package src.sql.homework2.init;

public class DatabaseCreationFacade {
    private final DatabaseInitializer databaseInitializer;


    public DatabaseCreationFacade() {
        this.databaseInitializer = new DatabaseInitializer();


    }

    public void createAndInsertDatabase(boolean create) {
        if(create) {
            databaseInitializer.createDatabase();

        }
    }
}
