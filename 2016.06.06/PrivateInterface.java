// http://www.coderanch.com/t/254867/java-programmer-OCPJP/certification/interface-private-protected
//: interfaces/RandomWords.java
// Implementing an interface to conform to a method.

// He comentat....
// package interfaces;
  
public class PrivateInterface {
  private interface InnerInterface {
        void f();
        void g();
  }
  
  private interface InnerInterface2 {
        void f();
        void g();
        String g(String s);
  }

  
  private class InnerClass1 implements InnerInterface,InnerInterface2 {
         public void f() { 
             System.out.println("From InnerClass1");
         }
         public void g() { 
             System.out.println("From InnerClass1 and 2");
         }

         public String g(String s) { 
             System.out.println("From InnerClass2");
             return "";
         }         
  }
  
  private class InnerClass2 implements InnerInterface {
         public void f() { 
             System.out.println("From InnerClass2");
         }
         public void g() { 
             System.out.println("From InnerClass1 and 2");
         }
  }
  
  public static void main(String[] args) {
        PrivateInterface pi = new PrivateInterface();
        pi.new InnerClass1().f();
        pi.new InnerClass2().f();
  }
} 
  
/* Output:
From InnerClass1
From InnerClass2
*/