package outroPacote; // Pai e Filho em pacotes diferentes
import certificacao.Pai;
class Filho extends Pai { 
  public void teste()
  {
		System.out.println("valor de x: "+x); // ok!
	}
	
	public static void main(String [] args)
	{
	  System.out.println("Filho");
	  (new Filho()).teste();
  }
}
