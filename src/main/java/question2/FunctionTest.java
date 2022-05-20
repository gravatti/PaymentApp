package question2;

import java.util.HashSet;
import java.util.Set;

public class FunctionTest {
  public static StringTester dupeTest = new StringTester() {
    @Override
    public boolean testString(String input) {
      HashSet<Character> string = new HashSet<>();
      for (int i = 0; i < input.length(); i++){
        string.add(input.charAt(i));
      }
      return !(string.size() == input.length());
    }
  };

  public static StringTester capsTest = new StringTester() {
    @Override
    public boolean testString(String input) {
     Boolean capsFound = false;
     for (int i = 0; i < input.length(); i++){
       if (Character.isUpperCase(input.charAt(i))){
         capsFound = true;
         break;
       }
     }
      return capsFound;
    }
  };

  public static StringTester hasDuplicateTester(){
    return dupeTest;
  }

  public static StringTester hasCapsChecker() {
    return capsTest;
  }
}
