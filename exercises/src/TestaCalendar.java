import java.util.*;
public class TestaCalendar {
  public static void main(String[] args) {
    Date d1 = new Date(1000000000000L);
    System.out.println("1st date " + d1.toString());
    Calendar c = Calendar.getInstance();
    c.setTime(d1);                          
    if(c.SUNDAY == c.getFirstDayOfWeek())   
      System.out.println("Sunday is the first day of the week");
    else System.out.println("First day of the week is "+c.getFirstDayOfWeek());
    System.out.println("trillionth milli day of week is " 
                       + c.get(c.DAY_OF_WEEK));    
    c.add(Calendar.MONTH, 1);                      
    Date d2 = c.getTime();                         
    System.out.println("new date " + d2.toString() ); 
  }
}
