package outroPacote; // Filho e Familia no mesmo pacote
class Familia { 
  public void m()
  {
		Filho f = new Filho();
		System.out.println("valor de Filho.x: "+f.x); // erro!
	}
}
