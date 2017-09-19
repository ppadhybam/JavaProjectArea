package creational.abstract_factory;

/**
 * Created by PriyabratP on 21-06-2017.
 */
public class BirdFactory extends AbstractFactory {
    @Override
    Animals getAnimal(String animalName) {
        return null;
    }

    @Override
    Birds getBird(String birdName) {
        if(birdName.equals("peacock"))
        {
            return new Peacock();
        }
        else if(birdName.equals("parrot"))
        {
            return new Parrot();
        }
        else
        {
            return null;
        }
    }
}
