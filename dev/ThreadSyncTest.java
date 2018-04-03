public class ThreadSyncTest extends Thread
{
  StringBuffer buffer;
  
  public static void main(String[] args)
  {
    StringBuffer buffer = new StringBuffer("A");
  
    Thread t1 = new ThreadSyncTest(buffer);
    Thread t2 = new ThreadSyncTest(buffer);
    Thread t3 = new ThreadSyncTest(buffer);

    t1.start();
    t2.start();
    t3.start();
    
    System.out.println("Main finished");
  }
  
  public ThreadSyncTest(StringBuffer sb)
  {
    this.buffer = sb;
  }
  
  public void run()
  {
    System.out.println("Thread "+Thread.currentThread().getName()+" running");
    synchronized (buffer)
    {
      System.out.println("Thread "+Thread.currentThread().getName()+" acquired the lock");
      
      for (int i = 0; i < 100 ; i++)
        System.out.println(buffer.toString());
      
      char c = buffer.charAt(0);
      System.out.println("c="+c);
      buffer.setCharAt(0, ++c);
      System.out.println("buffer="+buffer);
    }
  }
  
}
