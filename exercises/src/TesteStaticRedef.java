class Animal { 
  static void doStuff() { 
    System.out.print("a "); 
  } 
}
class Cao extends Animal {
   static void doStuff() {         // não é um override
	  System.out.print("d ");  
  }
  public static void main(String [] args) {
    Animal [] a = {new Animal(), new Cao(), new Animal()};
    for(int x = 0; x < a.length; x++)
      a[x].doStuff();               // invoca o método estático
  }
}
