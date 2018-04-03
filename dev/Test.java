class Test
{
  public static void main(String[] args)
  {
    int i = 0;

    try
    {    
      for (;true;i++)
      {
        System.out.println("1="+i);
        if (i/i++ > 0)
          break;
        System.out.println("2="+i);
      }
    }
    catch (RuntimeException rt)
    {
      System.out.println("RuntimeException");
    }
    catch(ArithmeticException ar)
    {
      System.out.println("ArithmeticException");
    }
    finally
    {
      System.out.println("finally");
    }
  }
}
