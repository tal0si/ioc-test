package ioc.database;

import ioc.Data;

public class DatabaseMongo implements Database{

    public DatabaseMongo(){
        System.out.println("Creation Instance DatabaseMongo");
    }
    @Override
    public void save(Data data) {
        System.out.print("Je sauvegarde en mongo:: " + data.getValue());
    }
}
