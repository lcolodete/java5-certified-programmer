class EqualsDemo
{
    private String str;
    
    EqualsDemo(String s)
    {
      str = s;
    }
    
    // método equals overloaded
    public boolean equals(EqualsDemo obj)
    {
      EqualsDemo ed = (EqualsDemo) obj;
      System.out.println(">"+ed.str);
      return true;
    }

}

public class EqualsDemoRun
{
  public static void main(String[] args)
  {
    EqualsDemo e1 = new EqualsDemo ("Java");
    EqualsDemo e2 = new EqualsDemo ("java");
    //e2.str = "javac";
    System.out.println(e1.equals(e2));
  }
  
}
