public class Varargs
{
    void calcula3(Animal... animais) { // recebe de 0 a N Animais
	for (Animal a : animais) System.out.println(a);
}
  public static void main(String[] args)
  {
    //new Varargs().calcula3(new Animal("1"),new Animal("2"),new Animal("3") );
    new Varargs().calcula(1,2,3,4,5,6);
  }
  
  void calcula(int... x) { // pode receber de 0 a N ints como parâmetro
	System.out.println(x[0]);
}

}

class Animal
{
  String id;
  Animal(String s)
  {
    id = s;
  }
  public String toString()
  {
    return id;
  }
}
