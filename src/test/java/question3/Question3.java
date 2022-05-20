package question3;

import java.util.List;
import java.util.stream.Collectors;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Question3 {

  /*
  Add stream methods to filter out users with less than 3 items, and return their names
   */
  @Test
  public void test(){
    var user1 = new User("a", 1);
    Assert.assertEquals(StreamsTest.processStream(
        List.of(user1).stream()).collect(Collectors.joining("")), "");

    var user2 = new User("b", 5);
    Assert.assertEquals(StreamsTest.processStream(
        List.of(user1, user2).stream()).collect(Collectors.joining("")), "b");

    var user3 = new User("c", 7);
    Assert.assertEquals(StreamsTest.processStream(
        List.of(user1, user2, user3).stream()).collect(Collectors.joining("")), "bc");
  }
}
