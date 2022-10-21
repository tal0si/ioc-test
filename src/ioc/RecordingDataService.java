package ioc;

public class RecordingDataService{

    private DatabasePostgres postgresDB;

    public RecordingDataService(DatabasePostgres database){

        this.postgresDB = database;
    }

    public void record(Data data) {
        postgresDB.save(data);
    }

}
