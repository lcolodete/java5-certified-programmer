import java.util.*;
public class TestWildcards3 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        Bar bar = new Bar();
        bar.doInsert(myList);
      }
}
class Bar {
   void doInsert(List<?> list) {
     list.add(new Dog());
   }
}
class Dog {}