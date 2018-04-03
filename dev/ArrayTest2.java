public class ArrayTest2
{
  public static void main(String[] args)
  {
    //method1(new int[]{1,2,3,});
    //method1(new int[]{});
    method1();
    //method1(1,2,3);
    
    float[] f = {};
  }
  
  static void method1(int... x)
  {
    System.out.println("var-args");
    System.out.println(x.length);
    System.out.println(x[0]);
    for (int i : x)
      System.out.print(i+", ");
  }
  
  static void method1(Object o)
  {
    System.out.println("Object");
    int[] a = (int[]) o;
    
    for (int i : a)
      System.out.print(i+", ");
  }
}
