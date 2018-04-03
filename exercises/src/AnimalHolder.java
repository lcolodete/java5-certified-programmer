public class AnimalHolder<T extends Animal> {
 T animal;
 public static void main(String[] args) {
   AnimalHolder<Animal> dogHolder = new AnimalHolder<Dog>(); // OK
   //AnimalHolder<Integer> x = new AnimalHolder<Integer>(); // Erro!
 }
}

class Animal {}
class Dog extends Animal {}