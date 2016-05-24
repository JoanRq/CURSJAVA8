import java.io.IOException;

public abstract class Metodos {
  final double pi = 3.1415927;

  public native void rotar(int[][] img);
  
  public final static void siesta(int a, int b)
      throws InterruptedException, IOException {}
  
  public abstract void fumar();
  
  String nombre(int a) {
    if (a == 2) {
      return ""; // no compila
    }
    return null;
  }
  
  int largo() {
    //return 9L; // no compila
    return 9;
  }
  
  
  void sergio() {}
  //default void carles() {}  // NO COMPILA 
  //void public andres() {}  // NO COMPILA
  
  void sergio2() {}
  
  // Especificadores
  // * static
  // * final: CONSTANTE o no anulable
  // * abstract
}