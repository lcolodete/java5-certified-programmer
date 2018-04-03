public class ThreadTest3
{
  public static void main(String[] args) throws Exception
  {
    Thread t = new Thread(new MyRunnable());
    t.start();
    System.out.println("Main vai esperar t acabar");
    t.join();
    System.out.println("t acabou; Main chegou ao fim");
  }
  
}

class MyRunnable implements Runnable
{
  public void run()
  {
    for (int i=0; i<5; i++)
    {
      System.out.println("contando..."+i);
      try
      {
        Thread.sleep(1000);
      }
      catch (InterruptedException e)
      {}
    }
  }
}
