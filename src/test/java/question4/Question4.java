package question4;

import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Question4 {

  @Test
  public void test(){
    GenericsTest<String> test1 = new GenericsTest<>(List.of("a", "b","c"));
    Assert.assertTrue(test1.hasNext());
    Assert.assertEquals(test1.next(), "a");
    Assert.assertTrue(test1.hasNext());
    Assert.assertEquals(test1.next(), "b");
    Assert.assertTrue(test1.hasNext());
    Assert.assertEquals(test1.next(), "c");
    Assert.assertFalse(test1.hasNext());

    GenericsTest<Integer> test2 = new GenericsTest<>(List.of(1, 2, 3, 4));
    Assert.assertTrue(test2.hasNext());
    Assert.assertEquals((int)test2.next(), 1);
    Assert.assertTrue(test2.hasNext());
    Assert.assertEquals((int)test2.next(), 2);
    Assert.assertTrue(test2.hasNext());
    Assert.assertEquals((int)test2.next(), 3);
    Assert.assertTrue(test2.hasNext());
    Assert.assertEquals((int)test2.next(), 4);
    Assert.assertFalse(test2.hasNext());
  }
}
