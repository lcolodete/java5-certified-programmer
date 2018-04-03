package outroPacote;
class Neto extends Filho { 
	public void testeNeto()
  	{
		System.out.println("valor de x: "+x); // ok!
	}
	
	public static void main(String [] args)
	{
		System.out.println("Neto");
		new Neto().testeNeto();
 	}
}
