public class Zoo {
  public static void darDeComer(Reptil r) {
    System.out.println("Dando de comer a " + r.getNombre());
  }
  
  public static void main(String[] args) {
    darDeComer(new Caiman());
    darDeComer(new Cocodrilo());
    darDeComer(new Reptil());
  }
}