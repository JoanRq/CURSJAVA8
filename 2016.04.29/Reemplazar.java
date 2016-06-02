public class Reemplazar {
  public static void main(String[] args) {
    char[] s = new char[100];
    String s1 = "Hola que tal como va la vida";
    for (int i=0; i<s1.length(); i++) {
      s[i] = s1.charAt(i);
    }
  
    reemplazar(s, s1.length());
    System.out.println(s); // Hola%20que%20tal%20como%20va
  }

  public static void reemplazar(char[] url, int len) {
    
  
  }
}