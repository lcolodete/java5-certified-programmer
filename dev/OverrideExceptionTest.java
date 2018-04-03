public class OverrideExceptionTest
{
  public static void main(String[] args)
  {
    Utils u = new Ping();

    int x = 0;
    try
    {
      x = u.getInt(args[0]);    
    }
    catch (ArrayIndexOutOfBoundsException e)
    {
      System.out.println("catch executed: ArrayIndexOutOfBounds");
    }
    catch (Exception e)
    {
      System.out.println("catch executed");
    }
    
    System.out.println("Resultado="+x);
        
  }
}

class Ping extends Utils
{
  int getInt(String arg)
  {
    System.out.println("Ping.getInt executed");
    return Integer.parseInt(arg);
  }

}

class Utils
{
  int getInt(String x) throws Exception
  {
    return 7;
  }
}
