import java.util.*;
public class GenericsTest
{
  public static void main(String[] args)
  {
    List<Object> l = new LinkedList<Object>();
    l.add(4);
    l.add("hello");
    l.add(false);
    
    System.out.println(l);
  }
}
