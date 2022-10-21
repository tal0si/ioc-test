import ioc.Data;
import ioc.RecordingDataService;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Data data = new Data("kikko");
        RecordingDataService service =  new RecordingDataService();
        service.record(data);
    }
}