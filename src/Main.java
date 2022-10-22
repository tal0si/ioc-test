import ioc.Data;
import ioc.database.Database;
import ioc.database.DatabasePostgres;
import ioc.RecordingDataService;
import ioc.serviceLocator.ServiceLocator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Data data = new Data("Je suis encore une data");


        String databaseTypeFromConfigFile = "ioc.database.DatabaseMongo";
//        String databaseTypeFromConfigFile = "ioc.database.DatabasePostgres";

        Database database = ServiceLocator.getDB(databaseTypeFromConfigFile);

        RecordingDataService service =  new RecordingDataService(database);
        service.record(data);
    }
}