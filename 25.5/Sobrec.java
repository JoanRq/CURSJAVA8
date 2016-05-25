import javax.swing.JFrame;
import java.util.ArrayList;

public class Sobrec extends JFrame {
  private ArrayList<String> as;
  private int b;
  
  public Sobrec() {
    super();
    as = new ArrayList<>();
  }
  
  public Sobrec(String a) {
    this();
    as.add(a);
  }
  
  public Sobrec(String a, int b) {
    this(a);
    this.b = b;
  }

  public void Sobrec() {
    System.out.println("HOLA");
  }
  
  public static void main(String[] args) {
    Sobrec c = new Sobrec("hola");
    Sobrec c1 = new Sobrec("adios", 5);
    c.Sobrec();
  }
}