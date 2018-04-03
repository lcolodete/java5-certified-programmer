import java.util.*;

public class RegexTest
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner("10 apples 20 oranges 30 pears");
    s.useDelimiter("\\d*");
    
    while (s.hasNext())
    {
      
      System.out.println(">"+s.next()+"<");
    }
  }
}
