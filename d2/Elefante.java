public class Elefante {
  public static void main(String[] args) {
    for (int i=1; i<=10; i++) {
 
      imprimirElef(i);
    }
  }

  static void imprimirElef(int i) {
    if (i==1)
      System.out.println(i + " elefante se balanceaba");
    else
      System.out.println(i + " elefantes se balanceaban"); 
  }
}