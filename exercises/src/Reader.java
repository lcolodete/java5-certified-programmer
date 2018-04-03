class Reader extends Thread {
   Calculator c;
   public Reader(Calculator calc) { c = calc; }
   public void run() {
     synchronized(c) {
         try {
            System.out.println("Aguardando o calculo...");
            c.wait();
            System.out.println("Notificacao recebida. Retomando execucao...");
         } catch (InterruptedException e) {}
         System.out.println("Total = " + c.total);
      }}
   public static void main(String [] args) {
      Calculator calculator = new Calculator();
      new Reader(calculator).start();
      new Reader(calculator).start();
      new Reader(calculator).start();
      calculator.start();
   }}
class Calculator extends Thread {
   int total;
   public void run() {
      synchronized(this) {
         for(int i=0;i<100;i++) {
            total += i;
         }
         System.out.println("Fim do calculo");
         notifyAll();
         System.out.println("Notificacoes enviadas");
      }}}
