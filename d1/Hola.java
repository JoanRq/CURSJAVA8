import java.util.Scanner;

public class Calc {
  public static void main(String[] args) {  
	Scanner entrada = new Scanner(System.in);
	
	// Obtenemos los n�meros de la entrada
	System.out.print("pon primer n�m: ");
	int n1 = entrada.nextInt(); 
	System.out.print("pon segundo num: ");
	int n2 = entrada.nextInt();
	
	System.out.print("operaci�n? ");
    String op = entrada.next();
	
	switch(op) {
      case "+":
		System.out.println(n1+n2);
		break;
	  case "-":
		System.out.println(n1-n2);
		break;
      case "*":
		System.out.println(n1*n2);
		break;
      case "/":
		System.out.println(n1/n2);
		break;
      default:
   	    System.out.println("operaci�n desconocida");
	}
  }
}