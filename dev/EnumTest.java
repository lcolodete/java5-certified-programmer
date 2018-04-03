public class EnumTest
{

  public static void main(String[] args)
  {
    if (args.length == 0)
      System.out.println("Nenhum parametro passado via linha de comando");
      
    int [] a = new int[0];
    
    System.out.println("a.length = "+a.length);
    
    for (int i = 0; i < a.length; i++)
    ;
    
    if ("Monday".equals(Calendar.DaysOfTheWeek.MONDAY))
   
      System.out.println(true);
    else
      System.out.println(false);
      
    Calendar.DaysOfTheWeek d = Calendar.DaysOfTheWeek.SUNDAY;
    System.out.println(d);
    
    Months m1 = Months.MARCH;
    System.out.println(m1);
  }
  enum Months
  {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
  };

}

class Calendar
{

  enum DaysOfTheWeek
  {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
  };



}
