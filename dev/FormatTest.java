public class FormatTest
{
  public static void main(String[] args)
  {
    String s = "it";
    boolean b = true;
    
  
    System.out.format("The value is %3$.2f . That is %2$b, isn't %1$s?", s, b, 0.345);
    System.out.println("");
    System.out.println("b="+method1());
  }
  
  static int method1()
  {
    byte b = (byte)10;
    return b;
  }
  
}
