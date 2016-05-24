import java.util.ArrayList;

public class Arreglos {
  public static void main(String[] args) {
    ArrayList<String> al1 = new ArrayList<>();
    al1.add("Ventura");
    al1.add("Marcos");
    al1.remove("Marcos");
    System.out.println(al1.size());
    System.out.println(al1.isEmpty());
    al1.set(0, "Joan");
    System.out.println(al1);
    
    al1.clear();
    System.out.println(al1);
    al1.add("Andreu");
    al1.add("Dani");
    al1.add("Zaira");
    System.out.println(al1.contains("Andres"));
    System.out.println(al1.contains("Dani"));
    
    ArrayList<String> al2 = new ArrayList<>();
    String s1 = "And";
    al2.add(s1 + "reu");
    al2.add("Dani");
    al2.add("Zaira");
    System.out.println(al2.equals(al1));
    
    //ArrayList<int> al3 = new ArrayList<>();
    
    
  }
}