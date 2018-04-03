public class AccountDanger implements Runnable {
  private ContaCorrente cc = new ContaCorrente();
  public static void main (String [] args) {
      AccountDanger r = new AccountDanger();
      Thread one = new Thread(r);
      Thread two = new Thread(r);
      one.setName("Fred");
      two.setName("Lucy");
      one.start();
      two.start();
  }
  public void run() {
   for (int x = 0; x < 5; x++) {
      saca(10); // faz um saque de $10,00
      if (cc.getSaldo() < 0) {
        System.out.println("limite estourou!");
      }
    }
  }
  private void saca(int val) {
     if (cc.getSaldo() >= val) {
        System.out.println(Thread.currentThread().getName() + " vai fazer um saque");
        try {
          Thread.sleep(500);
        } catch(InterruptedException ex) { }
        cc.realizaSaque(val);
        System.out.println(Thread.currentThread().getName() + " completou o saque");
     }     
     else
        System.out.println("Conta sem saldo para " + Thread.currentThread().getName()  
                     + " sacar: " + cc.getSaldo());
   }
}

class ContaCorrente {
   private int saldo = 50;
   public int getSaldo() {
      return saldo;
   }
   public void realizaSaque(int valor) {
      saldo = saldo - valor;
   }
}