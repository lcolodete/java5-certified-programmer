public class Propagate
{
  public static void main(String[] args)
  {
    if (args.length == 0)
    {
      System.out.println("Incorrect number of parameters");
      System.exit(0);
    }

    String s;
    
    if ("empty".equalsIgnoreCase(args[0]))
      s = "";
    else
      s = args[0];

    try
    {
      System.out.println("reverse("+s+") = "+reverse(s));
    }
    catch(IllegalArgumentException e)
    {
      System.out.println("The following error happened: " + e.getMessage());
    }
    finally
    {
      System.out.println("executing finally block");
    }
    
  }
  
  // Reverses the order of the characters in the String
  // argument, and returns the result
  // If the String has no characters, an exception will be thrown
  public static String reverse(String pStr) throws IllegalArgumentException
  {
    if (pStr.length() == 0)
      throw new IllegalArgumentException("A String a ser revertida nao pode ter tamanho zero!");
    
    String s = "";
    
    for (int i = pStr.length()-1; i >= 0; i--)
      s += pStr.charAt(i);
    
    return s;
  }
}
