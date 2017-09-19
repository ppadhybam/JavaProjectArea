package creational.factory_method;

/**
 * Created by PriyabratP on 21-06-2017.
 */
public class APIDatabaseHelper implements Database {
    @Override
    public String getDbName() {
        return "db2";
    }

    @Override
    public String getDbUserName() {
        return "user2";
    }

    @Override
    public String getDbUserPassword() {
        return "password2";
    }

    @Override
    public String getDbHostUrl() {
        return "http://localhost:85";
    }

    @Override
    public String getDbDriverName() {
        return "odbc";
    }
}
