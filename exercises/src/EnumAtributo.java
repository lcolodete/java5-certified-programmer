class Calendario2 {
enum DiaDaSemana
{
  SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
}
	  DiaDaSemana d;
}

public class EnumAtributo { 
  public static void main(String[] args) {
    Calendario2 c = new Calendario2();
    c.d = Calendario2.DiaDaSemana.SEGUNDA; // nome da classe é necessário
    System.out.println(c.d);
  }
}
