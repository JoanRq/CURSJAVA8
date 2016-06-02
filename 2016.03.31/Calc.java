import java.util.Scanner;

public class Calc {
  public static void main(String[] args) {  
	Scanner entrada = new Scanner(System.in);
	
	// Obtenemos los números de la entrada
	System.out.print("pon primer núm: ");
	String n1 = entrada.next(); 
	System.out.print("pon segundo num: ");
	String n2 = entrada.next();
	
	
	
	System.out.print("operación? ");
    String op = entrada.next();
	
	int r;
	
	switch(op) {
      case "+":
		r = n1+n2;
		break;
	  case "-":
		r = n1-n2;
		break;
      case "*":
		r = n1*n2;
		break;
      case "/":
		r = n1/n2;
		break;
      default:
   	    System.out.println("operación desconocida");
	}
	
	System.out.println("Resultado: " + r);
  }
}