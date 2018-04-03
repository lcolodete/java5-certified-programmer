public class IfSwitchTest
{
  public static void main(String[] args)
  {
    Boolean b = true;
    if (b)
      System.out.println("Boolean wrapper unboxed in if expression");
      
    if (b == true && b != false)
      // testando se nao precisa colocar chaves quando tem comentario
      // segunda linha de comentario
      System.out.println("if test");
    
    System.out.println("");
    System.out.println("<SWITCH CHAR TEST *** BEGIN>");
    System.out.println("");
    
    char c = 'A';
    
    final char CHAR_A = 'A';
    
    switch (c)
    {
      case CHAR_A:
      {
        System.out.println("case a");
        break;
      }
      case 'b': System.out.println("case b");
      default:
        System.out.println("case default");
      case 'c': System.out.println("case c");
      case 'd': System.out.println("case d");
    }
    
    System.out.println("");
    System.out.println("<SWITCH CHAR TEST *** END>");
    System.out.println("");
   
    System.out.println("");
    System.out.println("<SWITCH ENUM TEST *** BEGIN>");
    System.out.println("");

    CountryOutsideClass country = CountryOutsideClass.BRASIL;
    
    switch (country)
    {
      case BRASIL:
      {
        System.out.println("case BRASIL");
      }
      default:
        System.out.println("case default");
      case FRANCA: System.out.println("case FRANCA");
      case ESPANHA: System.out.println("case ESPANHA");
    }
    
    System.out.println("");
    System.out.println("<SWITCH ENUM TEST *** END>");
    System.out.println("");


    System.out.println("");
    System.out.println("<SWITCH ENUM TEST_2 *** BEGIN>");
    System.out.println("");

    switch (CountryOutsideClass.BRASIL)
    {
      case BRASIL:
      {
        System.out.println("case BRASIL");
        break;
      }
      default:
        System.out.println("case default");
      case FRANCA: System.out.println("case FRANCA");
      case ESPANHA: System.out.println("case ESPANHA");
    }
    
    System.out.println("");
    System.out.println("<SWITCH ENUM TEST_2 *** END>");
    System.out.println("");

/////////////////////

    System.out.println("");
    System.out.println("<SWITCH INT TEST *** BEGIN>");
    System.out.println("");

    final int x = 4;
    
    //NAO COMPILA! Wrapper variables (even final static ones) are not considered constants
    //final Integer x = 10; 
    
    switch (new Integer(2))
    {
      case 1:
      {
      }
      default: System.out.println("default");
      case 2: System.out.println("2");
      case 3: System.out.println("3");
      case x: 
    }
    
    System.out.println("");
    System.out.println("<SWITCH INT TEST *** END>");
    System.out.println("");

  }
  
  public static final char myChar = 'B';
  
  enum CountryInsideClass
  {
    EUA,
    PORTUGAL,
    CANADA
  };

}

enum CountryOutsideClass
{
  BRASIL,
  FRANCA,
  ESPANHA
}
