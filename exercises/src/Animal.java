public class Animal
{
  public static void main(String[] args)
  {
    System.out.println("\n[start test]\n");
    Animal a = new Animal();
    Dog d = (Dog) a;
    String s = (String) a;
    
  }
}

class Dog extends Animal
{

}

