public class ThreadTest
{
  public static void main(String[] args)
  {
  
    if (args.length == 0)
    {
      System.out.println("Modo de usar: ThreadTest NNN");
      System.exit(0);
    }

    MyJob job = new MyJob( Integer.parseInt(args[0]) );
    
    Thread t1 = new Thread(job);
    Thread t2 = new Thread(job);
    Thread t3 = new Thread(job);
    
    t1.setName("Leandro");
    t2.setName("Rodrigo");
    t3.setName("Danielle");
    
    t1.start();
    t2.start();
    t3.start();
    
    System.out.println("main chegou ao fim");
  }
}

class MyJob implements Runnable
{

  private int numberOfIterations;
  
  public MyJob(int pNumberOfIterations)
  {
    numberOfIterations = pNumberOfIterations;
    System.out.println("Serao executadas "+numberOfIterations+" iteracoes");
  }

  public void run()
  {
    for (int i=0; i<numberOfIterations; i++)
    {
      System.out.println(" --> "+Thread.currentThread().getName() + ", i = " + i);
    }
  }
}
