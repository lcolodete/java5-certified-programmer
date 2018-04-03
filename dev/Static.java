public class Static
{
  static int x, y;
  public static void main(String[] args)
  {
    System.out.println("1x="+x);
    x--;
    System.out.println("2x="+x);
    myMethod();
    System.out.println("3x="+x);
    System.out.println(x + y + ++x);
    System.out.println("4x="+x);
  }
  
  public static void myMethod()
  {
    System.out.println("1y="+y);
    y = x++ + ++x; // evaluates to y = -1 + 1
    System.out.println("2y="+y);
  }

}

//Output:
//1x=0
//2x=-1
//1y=0
//2y=0
//3x=1
//3
//4x=2
