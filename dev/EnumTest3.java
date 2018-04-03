public class EnumTest3
{
  enum Fish
  {
    GOLDFISH,
    ANGELFISH,
    GUPPY;
    
  }
  
  public static void main(String[] args)
  {
    Fish f = Fish.valueOf("GOLDFISH");
    System.out.println(f);
    f = Fish.GOLDFISH;
    System.out.println(f);
    f = Fish.valueOf("CAR");
    System.out.println(f);
  }
}
