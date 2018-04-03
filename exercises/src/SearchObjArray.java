import java.util.*;
class SearchObjArray {
  public static void main(String [] args) {
    String [] sa = {"one", "two", "three", "four"};
    Arrays.sort(sa);
    for(String s : sa)
      System.out.print(s + " "); 
    System.out.println("\none = " + Arrays.binarySearch(sa,args[0]));
  }
}