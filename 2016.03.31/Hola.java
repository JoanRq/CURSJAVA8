import java.util.Scanner;

public class Calc {
  public static void main(String[] args) {  
	Scanner entrada = new Scanner(System.in);
	
	// Obtenemos los números de la entrada
	System.out.print("pon primer núm: ");
	int n1 = entrada.nextInt(); 
	System.out.print("pon segundo num: ");
	int n2 = entrada.nextInt();
	
	System.out.print("operación? ");
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
   	    System.out.println("operación desconocida");
	}
  }
}