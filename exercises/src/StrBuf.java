public class StrBuf
{
  public static void main(String[] args)
  {
    StringBuffer sbf1 = new StringBuffer("123");
    StringBuffer sbf2 = new StringBuffer("123");
    
    System.out.println("sbf1 equals sbf2? "+sbf1.equals(sbf2));

    StringBuilder sbd1 = new StringBuilder("123");
    StringBuilder sbd2 = new StringBuilder("123");
    
    System.out.println("sbd1 equals sbd2? "+sbd1.equals(sbd2));

    String s1 = new String("123");
    String s2 = new String("123");
    
    System.out.println("s1 equals s2? "+s1.equals(s2));
  }
}
