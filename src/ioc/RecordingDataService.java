package ioc;

import ioc.database.Database;

public class RecordingDataService{

    private Database database;

    public RecordingDataService(Database database){

        this.database = database;
    }

    public void record(Data data) {
        database.save(data);
    }

}
