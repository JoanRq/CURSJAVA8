import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LoVamosAPetar {
  static {
    int[] valores = new int[] { 2, 3, 4 };
    // ExceptionInInitializerError
    //System.out.println(valores[4]);
  }
  
  public static void main(String[] args) {
    int[] valores = new int[] { 2, 3, 4 };
  
    // ArrayIndexOutOfBoundsException
    // System.out.println(valores[4]);
    
    // ArithmeticException
    //int a = 3 / 0;
    
    int[] valores2 = null;
    
    // NullPointerException
    //System.out.println(valores2.length);
    
    // NumberFormatException
    //int a = Integer.parseInt("hola");
    
    List<Integer> la = new ArrayList<Integer>();
    List<Integer> li = new LinkedList<Integer>();
    
    // ClassCastException
    //ArrayList<Integer> ai = (ArrayList<Integer>) li;
    
    // Errores
    // StackOverflowError
    f1();
    
    // NoClassDefFoundError
    
    // 2 checked
    // IOException
    // FileNotFoundException
  }
  
  static void f1() {
    f1();    
  }
}