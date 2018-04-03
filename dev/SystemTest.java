import java.util.*;

public class SystemTest
{
  public static void main(String[] args)
  {
    System.out.println("******************************");
    System.out.println("* current system environment *");
    System.out.println("******************************");
    System.out.println("");
    
    for (Object s : new TreeSet(System.getenv().keySet()))
    {
      System.out.println("Propriedade: "+s+"\nValor: "+System.getenv().get(s)+"\n");
    }
    
    System.out.println("*****************************");
    System.out.println("* current system properties *");
    System.out.println("*****************************");
    System.out.println("");
    
    for (Object s : new TreeSet(System.getProperties().keySet()))
    {
      System.out.println("Propriedade: "+s+"\nValor: "+System.getProperties().get(s)+"\n");
    }
    
  }
}
