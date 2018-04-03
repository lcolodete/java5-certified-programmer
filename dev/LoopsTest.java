public class LoopsTest
{
  public static void main(String[] args)
  {
    int x = 0;
    String s;
    Integer n = 0;
    for (int i=0, j=1, k=2; i < 10; System.out.println(i), j++, System.out.println(" "+j), x = 10, s="", n = new Integer(j) )
    {
      label:
      i++;
    }
    
    int[] iArray = {1,2,3,4,5,6,7,};
    
    for (int e : iArray)
    {
      System.out.println("elemento="+e);
    }
    
    int age = 0;
    
    outer:
      while (age <= 21)
      {
        age++;

        if (age == 16)
        {
          System.out.println("get your driver's license");
          continue outer;
        }
        
        System.out.println("another year");
        
        
      }
      
  }
}
