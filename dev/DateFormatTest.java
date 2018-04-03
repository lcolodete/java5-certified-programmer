import java.text.*;
import java.util.*;
class DateFormatTest
{
  public static void main(String... args) throws ParseException
  {
    String sDate = "Sunday, May 27, 2007";
    
    System.out.println("JVM Default locale: "+Locale.getDefault());
    
    //DateFormat dfShort = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
    //System.out.println(">SHORT: "+dfShort.parse(sDate));

    //DateFormat dfMedium = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
    //System.out.println(">MEDIUM: "+dfMedium.parse(sDate));

    //DateFormat dfLong = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
    //System.out.println(">LONG: "+dfLong.parse(sDate));

    DateFormat dfFull = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
    System.out.println(">FULL: "+dfFull.parse(sDate));

  }
}
