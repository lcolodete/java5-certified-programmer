public class InterfaceTest
{
  public static void main(String[] args)
  {
    new Ball().bounce();
  }
}

class Ball implements Bounceable
{
  public void bounce()
  {
    // frequency = 10; --> NÃO COMPILA: cannot assing a value to final variable frequency
    System.out.println("ball bouncing on the court");
  }
}

interface Bounceable
{
  void bounce();
  int frequency;
}
