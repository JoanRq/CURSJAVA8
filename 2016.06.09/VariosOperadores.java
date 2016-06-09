public class VariosOperadores {
	public static void main(String []args) {
		int a = 5, b = 10;
		
		a++;
		System.out.println(a);
		b++;
		System.out.println(b);
		System.out.println(a++);
		System.out.println(--b); // ejemplos Unarios
		
		int c = 8, d = ~c, e = d+1; // Complemento de x a nivel de bits: d vale -9 al sumarle u1 da -8
		System.out.println(d + "\t" + e);
		
		System.out.println(a); // como aqui a es incrementada valdra 7
		float x = 7;   	// se precisa float para mostrar los decimales, si fuese int saldria 2
		System.out.println(x /= 3);
		System.out.println(a %= 3);  // Ejemplo módulo: por tanto 7/3=2,3333 modulo 1
		
		// b vale 10 Desplazamiento aritmetico
		System.out.println(b<<2); // 10 = 1010 en binario desplazado a la izquierd 2 posiciones
															// quedaria 101000 que es 40 en decimal
		System.out.println(b>>2);// 10 = 1010 en binario desplazado a la derecha 2 posiciones
															// quedaria 10 que es 2 en decimal
		// Desplazamienyo logico
		System.out.println(b>>>1); // Desplazamos a la derecha 1 posición quedaria 101 que en decimal es 5
		System.out.println(b>>>2); // Desplazamos a la derecha 2 posiciones quedaria 10 que en decimal es 2
		// Hay que tener en cuenta que el desplazamiento lógico no mira el signo
		System.out.println(-b);
		System.out.println(-1>>>1); // Desplazamos a la derecha 1 posición quedaria 
																// 2147483643 binario : ‭0111 1111 1111 1111 1111 1111 1111 1111 
																// como hemos desplazado una posición vemos que nos mete un cero indicando que es negativo‬ 
 	}
}