import ioc.Data;
import ioc.database.DatabasePostgres;
import ioc.RecordingDataService;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Data data = new Data("Je suis encore une data");
        RecordingDataService service =  new RecordingDataService(DatabasePostgres.getInstance());
        service.record(data);
    }
}