import java.util.ArrayList;

public class Multis {
  public static void main(String[] args) {
    ArrayList<ArrayList<String>> a = new ArrayList<>();
    a.add(new ArrayList<String>());
    a.get(0).add("Marta");
    
    a.add(new ArrayList<String>());
    a.get(1).add("Joan");
    a.get(0).add("Andreu");
    
    System.out.println(a);
    
    ArrayList<String>[] al1 = new ArrayList[5];
    al1[0] = new ArrayList<>();
    al1[0].add("Andres");
  }
}