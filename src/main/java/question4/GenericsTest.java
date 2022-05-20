package question4;

import java.util.List;
/*
Create a basic iterator using a generic class.
 */
public class GenericsTest<T> {

  List<T> list;
  int i = 0;

  public GenericsTest(List<T> list) {
    this.list = list;
  }

  // Returns true if there are more items
  public boolean hasNext(){
    return false;
  }

  // returns the next item in the list
  public T next(){
    return null;
  }

}
