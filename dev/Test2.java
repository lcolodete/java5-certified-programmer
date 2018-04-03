public class Test2
{
  public static void main(String[] args)
  {
    Base b = new Subclass();
    System.out.println(b.x);
    System.out.println(b.method());
    
    Subclass s = new Subclass();
    System.out.println(s.x);
    System.out.println(s.method());
  }
}

class Base
{
  int x = 2;
  int method()
  {
    return x;
  }
}

class Subclass extends Base
{
  int x = 3;
  int method()
  {
    return x;
  }
}
