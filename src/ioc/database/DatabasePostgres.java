package ioc.database;


import ioc.Data;

public class DatabasePostgres implements Database{

    public DatabasePostgres(){
    }

    public void save(Data data) {
        System.out.print("Je sauvegarde:: " + data.getValue());
    }

}
