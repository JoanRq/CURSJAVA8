class Animal {
  public Animal() {
    System.out.println("Animal");
  }
}

class Primate extends Animal {
  public Primate() {
    System.out.println("Primate");
  }
}

public class Persona extends Primate {
  public static void main(String[] args) {
    new Persona();
  }
}