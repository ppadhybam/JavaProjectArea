package creational.abstract_factory;

/**
 * Created by PriyabratP on 21-06-2017.
 */
public class CreatorFactory {

    public static AbstractFactory getInstance(String choice)
    {
        if(choice.equals("animal"))
        {
            return new AnimalFactory();
        }
        else if(choice.equals("bird"))
        {
            return new BirdFactory();
        }
        else
        {
            return null;
        }
    }
}
