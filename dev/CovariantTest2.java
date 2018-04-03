class First
{
  protected String method1()
  {
    System.out.println("Calling super class method");
    return new String("Base");
  }
}

class Second extends First
{
  public String method1()
  {
    System.out.println("Calling sub class method");
    return "Derived";
  }
}

class CovariantTest21
{
  public static void main(String[] args)
  {
    First o = new Second();
    String s = (String)o.method1();
    System.out.println(s);
  }
}
