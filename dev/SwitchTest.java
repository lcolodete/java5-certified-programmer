public class SwitchTest
{
  public static int x = 1;
  static final int y = 3;

  public static void main(String[] args)
  {
    Integer z = 2;
    switch(z)
    {
    	case y: System.out.print("0"); // Compiles OK
    	case y-1: System.out.println("1"); // Compiles OK
    	//case x: z--; // Does not compile!!! Constant expression required
    }

  }
}
