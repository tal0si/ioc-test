package ioc.serviceLocator;

import ioc.database.Database;

import java.util.HashMap;

public class Cache {

    private HashMap<String, Database> services = new HashMap<>();

    public Database getDB (String dbName) {
        return services.get(dbName);
    }

    public void addDB(Database db) {
        services.put(db.getClass().getName(), db);
    }

}
