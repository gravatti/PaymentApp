package question1;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Question1 {

  /*
  Create classes for each of the 3 animal subtypes and make a way for them to make a corresponding sound.
   */
  @Test
  public void test(){
    Animal cow = AnimalFactory.makeAnimal("Cow");
    Animal lion = AnimalFactory.makeAnimal("Lion");
    Animal wolf = AnimalFactory.makeAnimal("Wolf");
    Assert.assertNotSame(cow.getClass(), AnimalFactory.class);
    Assert.assertNotSame(lion.getClass(), AnimalFactory.class);
    Assert.assertNotSame(wolf.getClass(), AnimalFactory.class);
    Assert.assertEquals(AnimalSoundMaker.makeSound(cow), "moo");
    Assert.assertEquals(AnimalSoundMaker.makeSound(lion), "roar");
    Assert.assertEquals(AnimalSoundMaker.makeSound(wolf), "howl");
    Assert.assertEquals(wolf.getClass().getSimpleName(), "Wolf");
    Assert.assertEquals(lion.getClass().getSimpleName(), "Lion");
    Assert.assertEquals(cow.getClass().getSimpleName(), "Cow");
  }

}
