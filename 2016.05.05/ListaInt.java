import java.util.ArrayList;
import java.util.List;

public class ListaInt {
  public static void main(String[] args) {
    List<Integer> edades = new ArrayList<>();
    edades.add(2);
    edades.add(3);
    edades.add(null);
    for (int edad : edades) System.out.print(edad);
  }
}