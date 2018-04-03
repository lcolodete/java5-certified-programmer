import java.util.*;
class PQTest {
  public static void main(String[] args) {
    int[] ia = {1,5,3,7,6,9,8 };            // unordered data
    PriorityQueue<Integer> pq1 =
      new PriorityQueue<Integer>();         // use natural order
    for(int x : ia)                         // load queue
      pq1.offer(x);
    for(int x : ia)                         // review queue
      System.out.print(pq1.poll() + " ");    
    System.out.println("");
  }
}
