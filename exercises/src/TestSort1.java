import java.util.*;
class TestSort1 {
  public static void main(String[] args) {
    ArrayList<String> cidades = new ArrayList<String>(); // #1
    cidades.add("Denver");
    cidades.add("Boulder");
    cidades.add("Vail");
    cidades.add("Aspen");
    cidades.add("Telluride");
    System.out.println("desordenada " + cidades);
    Collections.sort(cidades);                           // #2
    System.out.println("ordenada   " + cidades);
  }
}