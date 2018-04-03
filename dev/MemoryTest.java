import java.util.Date;

public class MemoryTest
{

  public static void main(String[] args)
  {
    System.out.println("<MemoryTest:: START>");
    
    Runtime rt = Runtime.getRuntime();
    
    System.out.println("Total JVM Memory = " + rt.totalMemory());
    
    System.out.println("Free memory (before) = " + rt.freeMemory());
    
    Date d = null;
    for (int i = 1; i <= 10000; i++)
    {
      d = new Date();
      
      if ( (i % 100) == 0 ) System.out.println(i + " Objects Created");
      
     // d = null;
    }
    
    System.out.println("Free memory (after) = " + rt.freeMemory());
    
    for (int i = 0; i < 10; i++)
    {
      System.out.println("Request GC run : "+i);
    
      rt.gc();
      
      System.out.println("\tFree memory after GC = " + rt.freeMemory());
    }
    
    
    System.out.println("<MemoryTest:: END>");
  }

}
