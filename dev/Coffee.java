enum CoffeeSize
{
  BIG(8),
  HUGE(10),
  OVERWHELMING(16)
  {
    public String getLetter()
    {
      return "O";
    }
    
    public String toString()
    {
      return "Size->Overwhelming";
    }
  };
  
  CoffeeSize(int ounces)
  {
    this.ounces = ounces;
    
  }
  
  private int ounces;
  
  
  public int getOunces()
  {
    return ounces;
  }
  
  public String getLetter()
  {
    return "A";
  }
}

public class Coffee
{
  CoffeeSize size;
  
  public static void main(String[] args)
  {
    Coffee c1 = new Coffee();
    c1.size = CoffeeSize.BIG;
    
    Coffee c2 = new Coffee();
    c2.size = CoffeeSize.HUGE;
    
    Coffee c3 = new Coffee();
    c3.size = CoffeeSize.OVERWHELMING;
    
    System.out.println("c1.size (oz.) = "+c1.size.getOunces());
    System.out.println("c1.letter = "+c1.size.getLetter());
    System.out.println("c2.size (oz.) = "+c2.size.getOunces());
    System.out.println("c2.letter = "+c2.size.getLetter());
    System.out.println("c3.size (oz.) = "+c3.size.getOunces());
    System.out.println("c3.letter = "+c3.size.getLetter());
    
    System.out.println("\n\nImprimindo CoffeeSize.values():");
    
    for (CoffeeSize cs : CoffeeSize.values())
    {
      System.out.println("CoffeeSize = "+cs);
    }
  }
}
