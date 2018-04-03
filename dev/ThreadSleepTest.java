public class ThreadSleepTest
{
	public static void main(String[] args)
	{
		Runnable r = new MyRunnable();

		Thread t = new Thread(r);

		t.start();

		System.out.println("Main finished");
	}

}

class MyRunnable implements Runnable
{
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
	}
}
