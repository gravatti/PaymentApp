package question3;

public class User {

  String name;
  Integer items;

  public User(String name, Integer items) {
    this.name = name;
    this.items = items;
  }

  public Integer getItems() {
    return items;
  }

  public String getName() {
    return name;
  }
}
