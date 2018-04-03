import java.util.*;

public class ToArrayTest
{
  public static void main(String[] args)
  {
    List a = new ArrayList();
    a.add("1");
    a.add("2");
    a.add("1");
    
    //String[] s = a.toArray(new String[0]);
    String[] s = (String[]) a.toArray();
    
    for (String str : s)
    {
      System.out.print(str);
    } 
  }
}
