class A {
  void m() {
    System.out.println("Hello m!!");
  }
  void n() {
    System.out.println("Hello n!!");
    this.m() ; //accessing method in the same class
  }
 }
class Example_01 {
  public static void main(String [] args) {
    A a = new A();
    a.n();
  }
}