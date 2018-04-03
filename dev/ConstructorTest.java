public class ConstructorTest
{
  public static void main(String[] args)
  {
    A a = new A();
  }
}

class A extends Letter
{
  int i;
  static int x;
  A()
  {
    System.out.println("i="+i);
    System.out.println("x="+x);
    //super();
    System.out.println("construindo A");
  }
  
  static
  {
    System.out.println("inicio bloco x="+x);
    x = 99;
    System.out.println("fim bloco x="+x);
    
  }
  
  {
    System.out.println("inicio bloco i="+i);
    i = 10;
    System.out.println("fim bloco i="+i);
  }
}

class Letter
{
  static
  {
    System.out.println("static init block super");
  }

  {
    System.out.println("instance init block super");
  }

  Letter()
  {
    System.out.println("Construindo Letter");
  }
}
