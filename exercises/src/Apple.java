import food.Fruit;

class Apple extends Fruit 
{ 

/* source code goes here */ 

	public static void main(String[] args)
	{
		//System.out.println("******* Executando Apple.class ******");
		println("******* Executando Apple.class ******");
		System.out.println("Apple.getColor() = "+ new Apple().getColor());
	}

	public String getColor()
	{

		return "Red";

	}

}