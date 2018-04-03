class ThreadA {
  public static void main(String [] args) {
    ThreadB b = new ThreadB();
    b.start();
    
    synchronized(b) {
      try {
        System.out.println("Aguardando b terminar...");
        b.wait();
        System.out.println("Retomando a execucao...");
      } catch (InterruptedException e) {}
      System.out.println("Total = " + b.total);
    }
  }
}
  
class ThreadB extends Thread {   
  int total;  
  public void run() {
    synchronized(this) {
      for(int i=0;i<100;i++) {
        total += i;
        System.out.print((total%10 == 0)?total+"\n":"");
      }
      notify();
    }
  }
}
