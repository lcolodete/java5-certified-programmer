public class ThreadTest2
{
  public static void main(String[] args)
  {
    Runnable r = new MyRunnable();
    new Thread(r, "A").start();
    new Thread(r, "B").start();
  }
  
}

class MyRunnable implements Runnable
{

  String str = new String("hello");

  public void run()
  {
    
    
    synchronized(str)
    {
      try
      {
        System.out.println(Thread.currentThread().getName()+" executing...");
        
        System.out.println(Thread.currentThread().getName()+" going to sleep...");
        
        Thread.sleep(5000);
        
        System.out.println(Thread.currentThread().getName()+" running again!");
      }
      catch(InterruptedException e)
      {
      }
    }
  }
}
