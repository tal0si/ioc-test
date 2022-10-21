import ioc.Data;
import ioc.database.DatabasePostgres;
import ioc.RecordingDataService;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Data data = new Data("Je suis une toujours data");
        RecordingDataService service =  new RecordingDataService(new DatabasePostgres());
        service.record(data);
    }
}