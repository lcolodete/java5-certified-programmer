import java.util.*;

class Shape
{
  public Shape (String s)
  {
    name = s;
  }
  private String name;
  public String toString()
  {
    return this.name;
  } 
}
class Circle extends Shape
{
  public Circle (String s)
  {
    super(s);
  }
}
class Rectangle extends Shape
{
  public Rectangle (String s)
  {
    super(s);
  }

}

class Generics4
{
  public static void main(String[] args)
  {
    ArrayList<Circle> a = new ArrayList<Circle>();
    a.add(new Circle("c1"));
    
    ArrayList b = a;
    
    method1(a);
    
    ArrayList<Rectangle> c = (ArrayList<Rectangle>) b;
    c.add(new Rectangle("r1"));
    
    for (Object o : b)
    {
      System.out.println(o);
    }
    
  }
  
  static void method1(ArrayList list)
  {
    System.out.println("entrei");
    list.add(new Circle("c2"));
  }
}

