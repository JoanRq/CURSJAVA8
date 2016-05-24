import static java.util.Arrays.*;
//import static java.util.Arrays; // NO COMPILA
//static import java.util.Arrays.*; // NO COMPILA

import java.util.List;

public class Imports {
  public static void main(String[] args) {
    List<String> a;
    
    String[] s = new String[] {
      "Andres", "Lorena", "Zaira", "Andreu"
    };
    
    a = asList(s);
  }
}