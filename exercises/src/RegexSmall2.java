import java.util.regex.*;
class RegexSmall2 {
  public static void main(String [] args) {
    Pattern p = Pattern.compile("\\d");      // the expression
    Matcher m = p.matcher("a12c3e456f");       // the source
    boolean b = false;
    while(b = m.find()) {
      System.out.print(m.start() + " ");
    }  
  }
}
