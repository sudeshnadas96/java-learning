//Example: use of static/class variable
public class Circle_01 {
 static int circlecount = 0; // class variable
 public double x, y, r; //instance variable
 public Circle_01(double x, double y, double r) {
  this.x = x; this.y = y; this.r = r;
 }
 public Circle_01(double r) {
  this(0.0 , 0.0, r);
  circlecount++;
 }
 public Circle_01(Circle_01 a) {
  this(a.x , a.y , a.r);
  circlecount++;
 }
 public Circle_01() {
  this(0.0, 0.0, 0.1);
  circlecount++;
 }
 public double Circumference() {
  return (2*(22/7)*r);
 }
 public double Area() {
  return (3.14159 * r *r);
 }
 public static void main(String[]args) {
  Circle_01 a1 = new Circle_01();
  System.out.println("a1 :" + a1.circlecount);

  Circle_01 a2 = new Circle_01(5.0);
  System.out.println("a2 :" + a2.circlecount);

  Circle_01 a3 = new Circle_01(a1);
  System.out.println("a3 :" + a3.circlecount);
  
  System.out.println("a1 :" + a1.circlecount + " " + "a2 :" + a2.circlecount + " " + "a3 :" + a3.circlecount);
 }
 }
 
  