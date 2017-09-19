package creational.factory_method;

/**
 * Created by PriyabratP on 21-06-2017.
 */
public class PortalDatabaseHelper implements Database {
    @Override
    public String getDbName() {
        return "db1";
    }

    @Override
    public String getDbUserName() {
        return "user1";
    }

    @Override
    public String getDbUserPassword() {
        return "pass1";
    }

    @Override
    public String getDbHostUrl() {
        return "http://localhost:80";
    }

    @Override
    public String getDbDriverName() {
        return "jdbc";
    }
}
