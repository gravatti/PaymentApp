package question5;

import java.lang.reflect.Field;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Question5 {

  /*
  Create a singleton class with lazy loading
   */
  @Test
  public void test() throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException {
    var test = SingletonTest.class.getDeclaredMethods();
    Assert.assertEquals(test.length, 1);
    Assert.assertEquals(test[0].getName(), "getInstance");

    Field instance = SingletonTest.class.getDeclaredField("instance");
    Assert.assertFalse(instance.isAccessible());
    instance.setAccessible(true);
    Assert.assertNull(instance.get(SingletonTest.class));

    SingletonTest singletonTest = SingletonTest.getInstance();
    Assert.assertNotNull(singletonTest);
    Assert.assertNotNull(instance.get(SingletonTest.class));
    Assert.assertEquals(singletonTest, instance.get(SingletonTest.class));
  }
}
