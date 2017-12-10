package singleton.example;

public class TestSingleton {
    public static void main(String[] args) {
        DatabaseLicense databaseLicense = DatabaseLicense.getInstance();
        databaseLicense.databaseConnection();

    }

}
