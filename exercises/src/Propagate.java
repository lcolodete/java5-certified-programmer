public class Propagate
{
  public static void main(String[] args)
  {
    String s = "123";
    try
    {
      System.out.println("reverse("+s+") = "+reverse(s));
    }
    catch(IllegalArgumentException e)
    {
      System.out.println("Erro: " + e.getMessage());
    }
    finally
    {
      System.out.println("Fim da execucao");
    }
    
  }
  
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
