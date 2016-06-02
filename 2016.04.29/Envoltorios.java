import java.util.ArrayList;

public class Envoltorios {
  public static void main(String[] args) {
    ArrayList<Integer> al1 = new ArrayList<>();
    
    Integer i1 = new Integer(24);
    int i2 = Integer.parseInt("-234");
    Integer i3 = Integer.valueOf("-234");    
    System.out.println(i2);
    
    Byte by1 = new Byte((byte) 1);
    byte by2 = Byte.parseByte("-2");
    Byte by3 = Byte.valueOf("-2");
    
    Short s1 = new Short((short) 1);
    Long l1 = new Long(2L);
    
    Float f1 = new Float(2.0f);
    Double d1 = new Double(2.2);
    
    Boolean b1 = new Boolean(true);
    Character c1 = new Character('c');
    // AUTOBOXING
    Integer i4 = 3;
    
    ArrayList<Integer> ali1 = new ArrayList<>();
    ali1.add(new Integer(3));
    ali1.add(Integer.parseInt("-23"));
    
    int primero = ali1.get(0);
    
    ArrayList<Boolean> alb1 = new ArrayList<>();
    alb1.add(new Boolean(true));
    alb1.add(false);
    
    boolean bb1 = alb1.get(0);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}