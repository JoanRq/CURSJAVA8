class Const1 {
}

class Const2 {
  private Const2() {}
}

class Const3 {
  public Const3(boolean b) {}
}

public class Const4 {
  public Const4() {}
  
  public static void main(String[] args) {
    Const1 r1 = new Const1();
    Const2 r2 = new Const2();
    Const3 r3 = new Const3(true);
    Const4 r4 = new Const4();
  }
}