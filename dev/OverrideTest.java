public class OverrideTest
{
  public static void main(String[] args)
  {
    A obj = new B();
    obj.print();  
  }
}

class A
{
  Number print()
  {
    System.out.print("A");
    return 0;
  }
}

class B extends A
{
  int print(int i)
  {
    super.print();
    System.out.print("B");
    return 0;
  }
}
