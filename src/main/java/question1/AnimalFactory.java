package question1;

public class AnimalFactory {
  public static Animal makeAnimal(String type){
    switch (type){
      case "Cow":
        return new Cow();
      case "Lion":
        return new Lion();
      case "Wolf":
        return new Wolf();
      default:
        return null;
    }
    //return null;
  }
}
