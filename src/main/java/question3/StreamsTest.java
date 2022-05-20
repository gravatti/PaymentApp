package question3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest {

  public static Stream<String> processStream(Stream<User> input) {
    List<String> users = new ArrayList<String>();
    users = input.filter(user -> user.getItems() > 3)
            .map(User::getName)
            .collect(Collectors.toList());
    return users.stream();
  }
}
