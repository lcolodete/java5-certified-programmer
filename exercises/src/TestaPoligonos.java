public class TestaPoligonos
{
  public void desenhaPoligono(Poligono p)
  {
    p.mostraPoligono();
  }
  
  public static void main(String [] args)
  {
    Triangulo t = new Triangulo();
    Losango l = new Losango();
    TestaPoligonos teste = new TestaPoligonos();
    System.out.println("mostrando triangulo");
    teste.desenhaPoligono(t);
    System.out.println("mostrando losango");
    teste.desenhaPoligono(l);
  }
}

class Poligono
{
  public void mostraPoligono()
  {
    System.out.println("mostrando poligono");
  }
}

class Triangulo extends Poligono
{
  public boolean isIsosceles()
  {
    return false;
  }
}

class Losango extends Poligono {}
