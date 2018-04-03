public class ExceptionTest
{
  public static void main(String[] args)
  {
    if (args.length == 0)
    {
      System.out.println("Incorrect number of parameters");
      System.exit(0);
    }

    try
    {
      checkFood(args[0]);
    }
    catch (BadFoodException e)
    {
      System.out.println("Don't like "+ args[0] + " !");
    }
    catch (IllegalArgumentException e)
    {
      System.out.println(e.getMessage());
    }

  }
  
  static void checkFood(String pFoodName) throws BadFoodException
  {
    if ("peach".equals(pFoodName))
    {
      throw new BadFoodException();
    }
    else if ("apple".equals(pFoodName))
      System.out.println("apple is ok");
    else
      throw new IllegalArgumentException("Unknown food!");
  }
  
}

class BadFoodException extends Exception
{
}
