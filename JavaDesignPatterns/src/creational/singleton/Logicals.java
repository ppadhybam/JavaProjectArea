package creational.singleton;

/**
 * Created by PriyabratP on 21-06-2017.
 */
public class Logicals {

    private static Logicals instance;

    private Logicals()
    {
    }

    public static Logicals getInstance()
    {
        if(instance == null)
        {
            instance = new Logicals();
        }
        return instance;
    }

    public String getResource(){
        return "this is the resource";
    }
}
