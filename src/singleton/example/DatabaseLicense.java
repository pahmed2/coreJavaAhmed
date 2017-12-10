package singleton.example;

public class DatabaseLicense {

    public static DatabaseLicense instance = new DatabaseLicense();
    private DatabaseLicense(){ }

    public static DatabaseLicense getInstance(){
        return instance;
    }

    public void databaseConnection(){
        System.out.print("Yor are Authorized to buy 1 licence");

    }
}

