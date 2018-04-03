public class WrapperTest
{

  //byte    8
  //short   16
  //int     32
  //long    64
  //float   32
  //double  64
  
  //char == unsigned short == 0 to 65535
  

  public static void main(String[] args)
  {
    new Defender().execute();
    test1();
    implicitCast();
    explicitCast();
  }
  
  public static void implicitCast()
  {
    // Widening : Put a smaller thing into a big container
    
    byte b = 34;
    System.out.println("implicitCast()");
    System.out.println("b="+b);
    
    int x = b;
    System.out.println("x="+x);
  }
  
  public static void explicitCast()
  {
    // Narrowing : Put a larger thing into a smaller container
    
    float a = 100.001f;
    System.out.println("explicitCast()");
    System.out.println("a="+a);
    
    int b = (int) a;
    System.out.println("b="+b);
  }
  
  public static void test1()
  {
    int n = 1;
    byte b = (byte) n;
    System.out.println(b);
    
    byte bb = (byte) 128;
    
    char c = (char) 10000;
    
    int b2 = (b + c);
    
    float f = 1000.0f;
    
    double d = 500.5D;
    
    Integer i = new Integer("1");
    
    int i2 = i.intValue();
    
    Integer i3 = Integer.valueOf("2000");
    
    float f2 = Integer.parseInt("2000");
    
    int x = (int) 3957.229;
    
    System.out.println(x);
  }
  
  
}

class Alien
{
  String invade(short ships)
  {
    short s = 10;
    return "a few";
  }
  String invade(short... ships)
  {
    return "many";
  }
}

class Defender
{
  void execute()
  {
    System.out.println( new Alien().invade((short)7) );
  }    
}
