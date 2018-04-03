import java.util.*;
public class GenericsExample<E>
{
  E name;
  Set<E> s = new TreeSet<E>();
  
  static public void main(String... args)
  {
    
    Dog d = new Dog("Fido");
    //Integer d = 10;
    makeArrayList(d);

    GenericsExample<String> ge = new GenericsExample<String>();    
    ge.test("1");
  }
  
  void test(E value)
  {
    E x;
    x = value;
    name = value;
    s.add(name);
    System.out.println(s);
  }
  
  static <T extends Animal> void makeArrayList(T t)
  {
    List<T> list = new ArrayList<T>();
    list.add(t);
    System.out.println(list);
  }
}

class Dog extends Animal
{
  String name;
  Dog(String name)
  {
    this.name = name;
  }
  public String toString()
  {
    return name;
  }
}

class Animal {}
