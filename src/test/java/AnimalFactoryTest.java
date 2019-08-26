import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalFactoryTest {
    AnimalFactory animalFactory = new AnimalFactory();

    @Test
    public void testCreateDog() {
        Animal firstAnimal = animalFactory.getAnimal("dog");
        String result = firstAnimal.makeSound();
        String expected = "Go Go";
        Assert.assertEquals(result, expected);
    }
    @Test
    public void testCreateCat() {
        Animal firstAnimal = animalFactory.getAnimal("cat");
        String result = firstAnimal.makeSound();
        String expected = "Meo Meo";
        Assert.assertEquals(result, expected);
    }
}
