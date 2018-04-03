public class AssertTest
{
  public static void main(String[] args)
  {
    int x = 10;
    for (; x > 0; --x)
    {
      System.out.println("valor de x: "+x);
    }
  
    assert(x==0) : "x igual a zero";
    
    assert false : "not supposed to get here!";
  }
}
