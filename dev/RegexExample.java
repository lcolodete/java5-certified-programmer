import java.util.regex.*;

public class RegexExample
{
  public static void main(String[] args)
  {
    String strToMatch = "Jack and JILL2 went up a hill1"; // para essa String, matches retorna false
    //String strToMatch = "ilL9"; // para essa String, matches retorna true
    Pattern p = Pattern.compile("(?i)ill\\d");
    Matcher m = p.matcher(strToMatch);
    
    System.out.println(m.matches());
    System.out.println( m.replaceAll("xxxx") );
    System.out.println( p.split(strToMatch)[0] );
  }
}
