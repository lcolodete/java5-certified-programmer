import static java.lang.System.out;

abstract class Animal
{
  Animal()
  {
    out.println("> Animal says hi");
  }
  
  
}

class Duck extends Animal
{
  Duck()
  {
    out.println("> Duck says quack");
  }

  int Duck()
  {
    return 0;
  } 
}

class AbstractClassTest
{
  public static void main(String... args)
  {
    out.println("Test started");
    
    Duck d = new Duck();
    out.println(">"+d.Duck()+"<");
    
    out.println("Test finished");
  }
}
