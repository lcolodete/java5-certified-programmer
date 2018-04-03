enum Grade
{
  A
  {
    public String toString()
    {
      return "Book";
    }
  },
  B,
  C,
  D
  {
    public String toString()
    {
      return "D";
    }

  }
}

public class EnumTest2
{
  public static void main(String[] args)
  {
    Grade grade = Grade.A;
    switch(grade)
    {
      case A:
        System.out.println(grade);
      default:
        System.out.println("default");
    }
  }
}
