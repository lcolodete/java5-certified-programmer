package food;

public abstract class Fruit 
{ 

/* source code */ 

	public static void println ( String m )
	{

		System.out.println("Fruit.println : " + m);

	}

	public abstract String getColor();

}