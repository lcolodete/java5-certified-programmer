class BigOuter {
private static int MAX = 10;
static void calc() { System.out.println("do"); }
  static class Nest {void go() { calc();System.out.println("hi"+MAX); } }
}

class Broom {
  static class B2 {void goB2() { System.out.println("hi 2"); } }
  public static void main(String[] args) {
    BigOuter.Nest n = new BigOuter.Nest();
    n.go();
    B2 b2 = new B2();
    b2.goB2();
  }
} 
