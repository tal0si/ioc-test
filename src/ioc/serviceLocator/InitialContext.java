package ioc.serviceLocator;

import ioc.database.DatabaseMongo;
import ioc.database.DatabasePostgres;

public class InitialContext {


    public Object lookup(String serviceName) {
        if (serviceName.equalsIgnoreCase(DatabaseMongo.class.getName())) {
            return new DatabaseMongo();
        } else if (serviceName.equalsIgnoreCase(DatabasePostgres.class.getName())) {
            return new DatabasePostgres();
        }
        return null;
    }

}
