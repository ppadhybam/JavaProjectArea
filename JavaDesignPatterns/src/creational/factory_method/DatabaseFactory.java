package creational.factory_method;

/**
 * Created by PriyabratP on 21-06-2017.
 */
public class DatabaseFactory {

    public Database getInstance(String dbType)
    {
        if(dbType.equals("portal"))
        {
            return new PortalDatabaseHelper();
        }
        else if(dbType.equals("api"))
        {
            return new APIDatabaseHelper();
        }
        else
        {
            return null;
        }
    }
}
