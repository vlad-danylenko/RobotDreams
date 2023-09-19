package src.sql.homework;

import src.sql.homework.init.DatabaseCreationFacade;

public class Main {
    public static void main(String[] args) {
        DatabaseCreationFacade databaseCreationFacade = new DatabaseCreationFacade();
        databaseCreationFacade.createAndInsertDatabase(false);
    }
}
