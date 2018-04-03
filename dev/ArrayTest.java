
// This class tests array declaration, construction/instantiation/creation and initialization

public class ArrayTest
{

  public static void main(String[] args)
  {
    //test1();
    //test2();
    //test3();
    //test4();
    //test5();
    test6();
  }
  
  public static void test6()
  {
    int [][] a = {{1,2,3,}, {3,4}}; // compila! a virgula deve ser um terminador valido
    System.out.println("a[0][0]="+a[0][0]);
    System.out.println("a[0][1]="+a[0][1]);
    System.out.println("a[0][2]="+a[0][2]);
    
    int [] b = (int[]) a[1]; // cast opcional
    printElements(b);
    
    Object o = a;
    
    int [][] a2 = (int[][]) o;
    
    int [] b2 = (int[]) o;
  }
  
  public static void test1()
  {

    // declaration and construction    
    int[] a = new int[10];
    
    // initialization
    initializeArray(a);
    
    printElements(a);
    
  }

  public static void test2()
  {

    // declaration, construction and initialization    
    int[] a = {0, 10, 20, 30, 40, 50};
    
    
    printElements(a);
    
  }

  public static void test3()
  {

    int[] a = new int[]{0, 1, 2, 3};
    
    
    printElements(a);
    
  }

  public static void test4()
  {

    printElements(new int[]{4, 3, 2, 1});
    
  }

  public static void test5()
  {

    printElements(new int[6]);
    
  }
  
  public static void initializeArray(int[] pArray)
  {
    System.out.println("<initializeArray>");
    for (int i = 0; i < pArray.length; i++)
    {
      pArray[i] = i*10;
      System.out.println("pArray["+i+"] = "+pArray[i]);
    }
    
  }
  
  public static void printElements(int[] pArray)
  {
    System.out.println("<printElements>");
    for (int i = 0; i < pArray.length; i++)
    {
      System.out.println("pArray["+i+"] = "+pArray[i]);
    }
  }

}
