package question5;

public class SingletonTest {
  private static SingletonTest instance;
  public static SingletonTest getInstance(){
    if (instance == null) {
      instance = new SingletonTest();
    }
    return instance;
  }

}
