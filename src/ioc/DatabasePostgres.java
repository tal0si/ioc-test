package ioc;


public class DatabasePostgres{

    public DatabasePostgres(){
    }

    public void save(Data data) {
        System.out.print("Je sauvegarde" + data.getValue());
    }

}
