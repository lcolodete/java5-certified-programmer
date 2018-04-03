public class Fruit
{
  protected String taste;
}

class Apple extends Fruit
{
  void method1()
  {
    Fruit f = new Fruit();
    System.out.println("from Fruit ref variable : "+f.taste);
    System.out.println("inherited from Fruit : "+taste);
  }
}
