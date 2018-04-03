import java.text.*;
import java.util.*;
public class TestaLocale {
  public static void main(String[] args) {

    Calendar c = Calendar.getInstance();
    c.set(2010, 11, 14);                  // 14 de dezembro de 2010
                                          // (mes comeca em 0)
    Date d2 = c.getTime();
    Locale locIT = new Locale("it", "IT");  // Italia
    Locale locPT = new Locale("pt");        // Portugal
    Locale locUS = new Locale("en", "US");  // EUA

    DateFormat dfBR = DateFormat.getInstance(); // Locale default
    System.out.println("BR       " + dfBR.format(d2));
    DateFormat dfBRfull = DateFormat.getDateInstance(DateFormat.FULL);
    System.out.println("BR full  " + dfBRfull.format(d2));    
    DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, locIT);
    System.out.println("Italia    " + dfIT.format(d2));
    DateFormat dfPT = DateFormat.getDateInstance(DateFormat.FULL, locPT);
    System.out.println("Portugal " + dfPT.format(d2));
    DateFormat dfUS = DateFormat.getDateInstance(DateFormat.FULL, locUS);
    System.out.println("EUA   " + dfUS.format(d2));    


  }
}
