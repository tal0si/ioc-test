package ioc.serviceLocator;

import ioc.database.Database;


public class ServiceLocator {

    private static Cache cache = new Cache();

    public static Database getDB(String dbName) {
        Database db = cache.getDB(dbName);
        if (db != null) {
            return db;
        }

        InitialContext context = new InitialContext();
        Database db1 = (Database) context.lookup(dbName);
        cache.addDB(db1);
        return db1 ;
    }

}
