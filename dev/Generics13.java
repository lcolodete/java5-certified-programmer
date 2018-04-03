import java.util.*;

class Generics13
{
  public static void main(String[] args)
  {
    List<Integer> list = new LinkedList<Integer>();
    list.add(1);
    list.add(4);
    list.add(-4);
    for (Iterator<Integer> i = list.iterator(); i.hasNext(); )
    {
      Integer in = i.next();
      System.out.println(in);
    }
  }
}
