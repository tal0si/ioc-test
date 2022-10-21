import ioc.Data;
import ioc.DatabasePostgres;
import ioc.RecordingDataService;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Data data = new Data("Je suis une data");
        RecordingDataService service =  new RecordingDataService(new DatabasePostgres());
        service.record(data);
    }
}