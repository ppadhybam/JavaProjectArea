package creational.abstract_factory;

/**
 * Created by PriyabratP on 21-06-2017.
 */
public abstract class AbstractFactory {

    abstract Animals getAnimal(String animalName);
    abstract Birds getBird(String birdName);
}
