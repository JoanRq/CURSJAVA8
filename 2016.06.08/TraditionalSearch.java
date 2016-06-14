import java.util.ArrayList;
import java.util.List;


public class TraditionalSearch {
  public static void main(String[] args) {
    List<Animal> animals = new ArrayList<Animal>(); // list of animals
    animals.add(new AnimalSeg("fish", false, true));
    animals.add(new AnimalSeg("kangaroo", true, false));
    animals.add(new AnimalSeg("rabbit", true, false));
    animals.add(new AnimalSeg("turtle", false, true));
    print(animals, new CheckIfHopper()); // pass class that does check
  }

  private static void print(List<AnimalSeg> animals, CheckTrait checker) {
    for (AnimalSeg animal : animals) {
      if (checker.test(animal)) // the general check
      System.out.print(animal + " ");
    }
    System.out.println();
  }
}
