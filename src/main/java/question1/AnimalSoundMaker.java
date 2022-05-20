package question1;

class Cow implements Animal{
  @Override
  public String makeSound() {
    return "moo";
  }
}

class Lion implements Animal{
  @Override
  public String makeSound() {
    return "roar";
  }
}

class Wolf implements Animal{
  @Override
  public String makeSound() {
    return "howl";
  }
}

public class AnimalSoundMaker {

  public static String makeSound(Animal animal){
    return animal.makeSound();
  }
}
