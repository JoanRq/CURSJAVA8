public class Paso5 {
  public static void main(String[] args) {
    int numero = 1;
    String letras = "abc";
    numero = numero(numero);
    letras = letras(letras);
    System.out.println(numero + letras);
  }

  public static int numero(int numero) {
    numero++;
    return numero;
  }
  
  public static String letras(String letras) {
    letras += "d";
    return letras;
  }
}