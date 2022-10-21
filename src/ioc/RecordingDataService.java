package ioc;

public class RecordingDataService{

    private DatabasePostgres postgresDB;

    public RecordingDataService(){

        postgresDB = new DatabasePostgres();
    }

    public void record(Data data) {
        postgresDB.save(data);
    }

}
