import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Listas {
  public static void main(String[] args) {
    // LIST a ARRAY
    List<String> als1 = new ArrayList<>();
    // NO: ArrayList<String> als2 = new List<>();
    
    als1.add("Lorena");
    //Object[] arr1 = als1.toArray();
    String[] sarr1 = als1.toArray(new String[0]);
    
    System.out.println(sarr1[0]);
       
    // ARRAY a LIST
    String[] est = new String[] {
      "Zaira",
      "Carlos"
    };
    
    Arrays.sort(est);
    for (String s: est) System.out.print(s + " ");
    
    ArrayList<String> al1 = new ArrayList<String>(
        Arrays.asList(est));
    
    al1.add("Marta");
    
    // Ordena la lista: Collections.sort()
    Collections.sort(al1);
    
    System.out.println(al1);
    
    List<String> l2 = Arrays.asList("Andreu", "Dani");
    System.out.println(l2);
    
  }
  
  public static int calcular(List<Integer> li1) {
    ArrayList<Integer> arl1 = (ArrayList<Integer>) li1;

    return 0;
  }  
  













  
}