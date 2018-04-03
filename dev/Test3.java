public class Test3
{
  public static void main(String[] args) throws Exception
  {
    Object s = "hello";
    Object i = 10;
    
    if (s instanceof String)
    {
      System.out.println("s IS-A String!");
    }

    if (i instanceof Number)
    {
      System.out.println("i IS-A Number!");
    }
    
    System.out.println(s);
    System.out.println(i);
    
    method1();
  }
  
  static void method1() throws Exception
  {
    System.out.println("method1");
  }
}
