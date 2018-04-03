public class OverrideTest2
{
  public static void main(String[] args)
  {
    Base b = new Derived();
    b.method1();
    System.out.println("b.i = "+b.i);
  }
}

abstract class Base
{
  int i = 123;
  
  synchronized void method1()
  {
    System.out.println("Base");
  }
  
  abstract void method2();
}

class Derived extends Base
{
  int i = 456;
  
  void method1()
  {
    System.out.println("Derived");
  }
  
  synchronized void method2(){}
}


// OverrideTest2.java:25: method1() in Derived cannot override method1() in Base; overridden method is static
//   void method1()
//        ^
// 1 error
//
// class Base
// {
//   int i = 123;
//   
//   static void method1()
//   {
//     System.out.println("Base");
//   }
// }
// 
// class Derived extends Base
// {
//   int i = 456;
//   
//   void method1()
//   {
//     System.out.println("Derived");
//   }
// }


// OverrideTest2.java:25: method1() in Derived cannot override method1() in Base; overriding method is static
//   static void method1()
//               ^
// 1 error
//
// class Base
// {
//   int i = 123;
//   
//   void method1()
//   {
//     System.out.println("Base");
//   }
// }
// 
// class Derived extends Base
// {
//   int i = 456;
//   
//   static void method1()
//   {
//     System.out.println("Derived");
//   }
// }
