enum TamanhoPizza { 
     MEDIA(4), GRANDE(8), GIGANTE(16);  
     TamanhoPizza(int fatias) {
      this.fatias = fatias;  
     }
    private int fatias;      // variável de instância que cada
                             // valor do enum possui
    public int getFatias() {
      return fatias;
    }
}
class Pizza {
   TamanhoPizza fatias;    
   public static void main(String[] args) {
      Pizza p1 = new Pizza();
      p1.fatias = TamanhoPizza.MEDIA;
      Pizza p2 = new Pizza();
      p2.fatias = TamanhoPizza.GIGANTE;
      System.out.println(p1.fatias.getFatias()); // 4
      System.out.println(p2.fatias.getFatias()); // 16
   }
}
