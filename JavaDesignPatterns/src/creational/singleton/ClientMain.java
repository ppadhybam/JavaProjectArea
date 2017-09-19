package creational.singleton;

/**
 * Created by PriyabratP on 21-06-2017.
 */
public class ClientMain {

    public static void main(String[] args)
    {
        Logicals logicals = Logicals.getInstance();

        System.out.println(logicals.getResource());
    }
}
