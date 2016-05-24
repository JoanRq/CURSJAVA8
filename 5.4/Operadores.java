public class Operadores {
  public static void main(String[] args) {
    // 1.
    int i1 = 10;
    int n1 = i1++%5;    
    System.out.println(i1);
    System.out.println(n1);
    
    // 2.
    int i2 = 10;
    int n2 = ++i2%5;
    System.out.println(i2);
    System.out.println(n2);
    
    // 3.
    int i3 = 8;
    i3 >>= 2;
    System.out.println(i3);
    
    // 4.
    int i4 = 17;
    i4 >>= 1;
    System.out.println(i4);
    
    // 1. Post unario  x++, x--
    // 2. Pre unario   ++x, --x
    // 3. Otros unarios -x, !x, ~x, +x
    // 4. Mult-div: x*y, x/y, x%y
    // 5. Suma-rest: x+y, x-y
    // 6. Desplazamiento: x<<y, x>>y, x>>>y
    // 7. Relacionales: x<y, x>y, x<=y, x>=y, instanceof
    // 8. Igualdad: x==y, x!=y
    // 9. Lógicos a nivel de bit: x&y, x|y, x^y
    // 10. Lógicos booleanos: x&&y, x||y
    // 11. Ternario:  x?y:z
    // 12. Asignación: x=y, x+=y, x-=y, x/=y,
    //                 x%=y, x&=y, x^=y, x<<=y,
    //                 x>>=y, x>>>=y
  
    int x = 2 * 5 + 3 * 4 - 8;
    System.out.println(x);
  }
}
