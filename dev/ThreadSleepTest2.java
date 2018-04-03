public class ThreadSleepTest2 extends Thread
{
	public static void main(String[] args)
	{
		Thread t = new ThreadSleepTest2();

		t.start();

		System.out.println("Main finished");
	}
	
	public void run()
	{
	  System.out.println("Thread Running!");
	  
		for (int i = 1; i <= 100; i ++)
		{
			if ( (i%10) == 0 )
				System.out.println("Running -> count = "+i);

			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e)
			{
				System.out.println("Could not put thread to sleep");
				System.exit(0);
			}
		}
		
		System.out.println("Thread finished!");
	}

}

