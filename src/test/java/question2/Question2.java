package question2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Question2 {

  @Test
  public void test(){
    // Make a function that returns true if string has duplicates
    StringTester sTest1 = FunctionTest.hasDuplicateTester();
    Assert.assertTrue(sTest1.testString("aaa"));
    Assert.assertFalse(sTest1.testString("abc"));

    // Make a function that returns true if any capital letters found
    StringTester sTest2 = FunctionTest.hasCapsChecker();
    Assert.assertTrue(sTest2.testString("Aaa"));
    Assert.assertFalse(sTest2.testString("abc"));
  }

}
