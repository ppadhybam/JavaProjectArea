package creational.factory_method;

/**
 * Created by PriyabratP on 21-06-2017.
 */
public class ClientFactory {

    private static String driverName;

    public static void main(String [] args)
    {
        DatabaseFactory factory = new DatabaseFactory();

        Database dbPortal = factory.getInstance("portal");
        driverName = dbPortal.getDbDriverName();
        System.out.println("Database Driver Name is :"+driverName);

        Database dbApi = factory.getInstance("api");
        driverName = dbApi.getDbDriverName();
        System.out.println("Database Driver Name is :"+driverName);
    }
}
