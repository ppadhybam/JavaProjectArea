package creational.abstract_factory;

/**
 * Created by PriyabratP on 21-06-2017.
 */
public class AnimalFactory extends AbstractFactory {

    @Override
    Animals getAnimal(String animalName) {
        if(animalName.equals("elephant"))
        {
            return new Elephant();
        }
        else if(animalName.equals("cow"))
        {
            return new Cow();
        }
        else
        {
            return null;
        }
    }

    @Override
    Birds getBird(String birdName) {
        return null;
    }
}
