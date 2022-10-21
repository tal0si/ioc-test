package ioc.database;


import ioc.Data;

public class DatabasePostgres implements Database{

    private static DatabasePostgres instance = null;
    public DatabasePostgres(){
        System.out.println("Creation Instance DatabasePostgres");
    }

    public static DatabasePostgres getInstance(){
        if (instance == null){
            instance = new DatabasePostgres();
        }
        return instance;
    }

    public void save(Data data) {
        System.out.print("Je sauvegarde:: " + data.getValue());
    }

}
