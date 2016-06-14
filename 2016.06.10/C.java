abstract class A {
  abstract void f1();
}

class B extends A { 
  void f1() { System.out.println("b"); }
}

public class C extends A {
  public static void main(String[] args) {
    procesar(new B());
    procesar(new C());
  }
  
  public static void procesar(A a) {
    a.f1();
    C c = (C) a;
  }
  
  void f1() {
    System.out.println("a");
  }
}

