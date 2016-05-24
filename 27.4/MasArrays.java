import java.util.ArrayList;
import java.util.List;

public class MasArrays {
  public static void main(String[] args) {
    //ArrayList l1 = new ArrayList();
    //ArrayList l2 = new ArrayList(10);
    //ArrayList l3 = new ArrayList(l1);
    
    ArrayList<String> l4 = new ArrayList<String>();
    ArrayList<String> l5 = new ArrayList<>();
    
    List<String> l6 = new ArrayList<>();
    // NO: ArrayList<String> l7 = new List<>();
    
    // añadir y borrar: add(), remove()
    l4.add("hola");
    l4.add(1, "adios");
    System.out.println(l4.get(0));    

    System.out.println(l4.remove("adios"));
    l4.remove(0);
    
    // cambio el valor: set()
    l4.add("tio");
    l4.set(0, "tia");
    
    // String:    .length() 
    // array:     .length
    // ArrayList: .size()
    System.out.println(l4.size());
    System.out.println(l4.isEmpty());

    System.out.println(l4);    
    //l5.add(true);
  }
}