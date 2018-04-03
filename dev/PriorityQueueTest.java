import java.util.*;

class PriorityQueueTest
{
  public static void main(String... args)
  {
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    for (int i = 0; i < 5; i++)
    {
      pq.offer(i);
    }
    
    System.out.println(pq);
  }
}
