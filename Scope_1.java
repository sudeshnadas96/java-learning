class Scope_1 {
 public static void main(String[]args) {
  int x;
  x = 32;
  if(x == 32) {
    int y = 10;
    System.out.println("x and y: " + x + " " + y);
    x = y * 2;
  }
  System.out.println("x is:" + x);
 }
}