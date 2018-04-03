class Calendario {
  DiaDaSemana d;
}

public class EnumFora {  
  public static void main(String[] args) {
    Calendario c = new Calendario();
    c.d = DiaDaSemana.SEGUNDA;
    System.out.println(c.d);
  }
}

enum DiaDaSemana
{
  SEGUNDA,
  TERCA,
  QUARTA,
  QUINTA,
  SEXTA,
  SABADO,
  DOMINGO
}
