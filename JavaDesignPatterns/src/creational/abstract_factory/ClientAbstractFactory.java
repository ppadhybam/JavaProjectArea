package creational.abstract_factory;

/**
 * Created by PriyabratP on 21-06-2017.
 */
public class ClientAbstractFactory {

    public static void main(String[] args)
    {
        AbstractFactory abstractFactory = CreatorFactory.getInstance("animal");
        Animals animals = abstractFactory.getAnimal("elephant");
        animals.printAnimalName();
    }
}
