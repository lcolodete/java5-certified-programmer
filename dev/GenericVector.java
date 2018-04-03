import java.util.*;

public class GenericVector
{
  public static void main(String[] args)
  {
    Vector<String> v = new Vector<String>(); // compila e roda OK
    //Vector<? extends String> v = new Vector<String>(); // compila, mas não compila as linhas seguintes (add)
    //Vector<? super String> v = new Vector<String>(); // compila e roda OK
    //Vector<Object> v = new Vector<Object>(); // compila e roda OK
    v.add("USA");
    v.add("Russia");
    v.add("USA");
    v.add(null);
    
    List<? extends String> list = v;
    for(String s : list)
      System.out.println(s);
  }
}
