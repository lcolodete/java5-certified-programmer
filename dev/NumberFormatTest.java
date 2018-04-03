import java.text.*;
import java.util.*;

public class NumberFormatTest
{
  public static void main(String[] args)
  {
    System.out.println("JVM Default locale = "+Locale.getDefault());
    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
    Number parsedNumber = null;
    try
    {
      parsedNumber = nf.parse("5,000.56");
      System.out.println("Parsed number = "+parsedNumber);
    }
    catch(ParseException pe)
    {
      System.out.println("Unable to parse string into a number!");
    }
    
    System.out.println("Currency string in Locale.US = "+ nf.format(parsedNumber));
  }
}
